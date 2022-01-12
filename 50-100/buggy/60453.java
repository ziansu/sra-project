public static boolean isFileExists(java.lang.String path, ml.shifu.shifu.container.obj.RawSourceData.SourceType sourceType) throws java.io.IOException {
    ml.shifu.shifu.fs.FileSystem fs = ml.shifu.shifu.fs.ShifuFileUtils.getFileSystemBySourceType(sourceType);
    ml.shifu.shifu.fs.FileStatus[] fileStatusArr = fs.globStatus(new ml.shifu.shifu.fs.Path(path));
    return !((fileStatusArr == null) || ((fileStatusArr.length) == 0));
}