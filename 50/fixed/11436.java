public void run() {
    try {
        writeFilesToZip();
    } catch (java.io.IOException ioe) {
        ioe.printStackTrace();
        net.sourceforge.processdash.util.FileUtils.safelyClose(out);
        net.sourceforge.processdash.util.FileUtils.safelyClose(this);
    }
}