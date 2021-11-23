public void readFile(java.lang.String _fileName) {
    try {
        java.lang.System.out.println("Started reading");
        at.fhooe.mc.it.xml.StreamParser.parse(_fileName, mSmsData);
        java.lang.System.out.println("Finished reading");
    } catch (java.lang.Exception _ex) {
        _ex.printStackTrace();
    }
}