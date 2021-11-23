static boolean copy(final java.io.File src, java.io.File dst) {
    return cn.edu.fudan.se.dac.FileUtil.getBufferedWriter(dst, new cn.edu.fudan.se.dac.FileUtil.BufferedWriterHandler() {
        @java.lang.Override
        public boolean handle(java.io.BufferedWriter writer) {
            return cn.edu.fudan.se.dac.FileUtil.eachLine(src, new cn.edu.fudan.se.dac.FileUtil.OutputLineHandler(writer), null);
        }
    });
}