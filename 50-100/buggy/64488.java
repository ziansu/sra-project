public java.lang.String getImageUrlOrPath(android.content.Context context) {
    java.io.File localFile = com.medo.pravoslavenkalendar.utils.FileUtils.getOutputPictureFile(context, dayOfYear, false);
    if (localFile.exists()) {
        return "file:" + (localFile.getAbsolutePath());
    }else {
        return ((com.medo.pravoslavenkalendar.BuildConfig.API_IMAGE) + (getDayOfYear())) + ".jpg";
    }
}