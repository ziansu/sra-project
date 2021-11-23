@java.lang.Override
public void run() {
    try {
        this.keywordsTable.clear();
        this.nanorcFile = getClass().getResource(ijfx.ui.display.code.NanorcParser.findFileLanguage(language)).getFile();
        nanoRcParseV2(this.nanorcFile);
    } catch (java.lang.NullPointerException e) {
        java.lang.System.out.println("No nanorc file for this language");
        this.keywordsTable = new java.util.Hashtable();
    }
}