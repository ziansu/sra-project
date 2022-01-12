public static synchronized java.util.ArrayList<it.faerb.herakles.LocationLog> loadFiles(android.content.Context context, int start, int end) {
    end = java.lang.Math.min(end, it.faerb.herakles.LocationLog.getFilesCount(context));
    java.util.ArrayList<it.faerb.herakles.LocationLog> ret = new java.util.ArrayList<>();
    for (int i = start; i < end; i++) {
        ret.add(it.faerb.herakles.LocationLog.loadFile(context, i));
    }
    return ret;
}