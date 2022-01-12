public static void save() {
    if ((chen.mfmaker.io.IOManager.IOMap) == null) {
        java.lang.System.err.println("û������Ŀ¼");
    }else {
        chen.mfmaker.io.IOManager.saveFile(chen.mfmaker.io.IOManager.IOMap, chen.mfmaker.io.IOManager.path);
    }
}