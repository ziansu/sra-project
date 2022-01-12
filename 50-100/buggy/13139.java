@java.lang.Override
public java.io.File execute(java.io.File file) throws java.io.IOException {
    java.io.File chnFile = de.neemann.digital.gui.Main.checkSuffix(file, "chn");
    java.lang.System.out.println(("create chn from " + file));
    try (java.io.Writer chn = new java.io.OutputStreamWriter(new java.io.FileOutputStream(chnFile), "UTF-8")) {
        chn.write(("1 4 1 0 \r\n" + ((("\r\n" + "ATF1502AS\r\n") + "10\r\n") + "1\r\n")));
        chn.write(chnFile.getPath());
    }
    return chnFile;
}