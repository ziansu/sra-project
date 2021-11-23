public static java.util.List<java.lang.String> getAllAD() {
    java.io.File file = new java.io.File(com.github.baby.owspace.util.FileUtil.ADPATH);
    java.io.File[] fileList = file.listFiles();
    java.util.List<java.lang.String> list = new java.util.ArrayList<>();
    if (null != fileList) {
        for (java.io.File f : fileList) {
            list.add(f.getAbsolutePath());
        }
    }
    return list;
}