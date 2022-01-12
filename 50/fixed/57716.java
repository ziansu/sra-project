@java.lang.Override
public com.dua3.meja.text.RichText getText() {
    return isEmpty() ? com.dua3.meja.text.RichText.emptyText() : toRichText(poiCell.getRichStringCellValue());
}