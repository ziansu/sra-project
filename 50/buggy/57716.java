@java.lang.Override
public com.dua3.meja.text.RichText getText() {
    try {
        return isEmpty() ? com.dua3.meja.text.RichText.emptyText() : toRichText(poiCell.getRichStringCellValue());
    } catch (java.lang.Exception e) {
        throw newIllegalStateException(e);
    }
}