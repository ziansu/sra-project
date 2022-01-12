public static void mkdir(java.lang.String db_path, java.lang.String db_path2) {
    try {
        java.io.File file = new java.io.File(((db_path + "/") + db_path2));
        if (!(file.getParentFile().exists())) {
            file.getParentFile().mkdir();
        }
        if (!(file.exists())) {
            file.createNewFile();
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return ;
}