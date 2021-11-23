@java.lang.Override
public cn.finalteam.rxgalleryfinal.rxjob.job.Result onRunJob() {
    java.lang.String originalPath = mediaBean.getOriginalPath();
    java.io.File bigThumFile = cn.finalteam.rxgalleryfinal.utils.MediaUtils.createThumbnailBigFileName(context, originalPath);
    java.io.File smallThumFile = cn.finalteam.rxgalleryfinal.utils.MediaUtils.createThumbnailSmallFileName(context, originalPath);
    if (!(bigThumFile.exists())) {
        cn.finalteam.rxgalleryfinal.utils.BitmapUtils.createThumbnailBig(bigThumFile, originalPath);
    }
    if (!(smallThumFile.exists())) {
        cn.finalteam.rxgalleryfinal.utils.BitmapUtils.createThumbnailSmall(smallThumFile, originalPath);
    }
    cn.finalteam.rxgalleryfinal.rxjob.job.Result result = Result.SUCCESS;
    result.setResultData(mediaBean);
    return result;
}