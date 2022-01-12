@java.lang.Override
public processing.mode.java.EditorFooter createFooter() {
    processing.mode.java.EditorFooter footer = super.createFooter();
    addErrorTable(footer);
    return footer;
}