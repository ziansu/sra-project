public static void clearLogs(java.lang.String stLogDirectory) {
    util.FileUtil.deleteFilesInDirectory(stLogDirectory, new util.ITest() {
        @java.lang.Override
        public boolean test(java.lang.Object object) {
            return true;
        }
    }, false);
}