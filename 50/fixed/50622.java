public static void init(org.osgi.framework.BundleContext bundleContext) {
    java.lang.String path = bundleContext.getProperty(org.opencastproject.videoeditor.ffmpeg.FFmpegEdit.CONFIG_FFMPEG_PATH).trim();
    if (path != null) {
        org.opencastproject.videoeditor.ffmpeg.FFmpegEdit.binary = path;
    }
}