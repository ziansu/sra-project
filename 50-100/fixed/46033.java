@java.lang.Override
public void removeCategory(int id) throws cz.muni.fi.pb138.odskart.backend.KartException, java.io.IOException {
    if (id >= (spreadSheet.getSheetCount())) {
        throw new cz.muni.fi.pb138.odskart.backend.KartException("Category doesn't exist!");
    }
    if ((spreadSheet.getSheetCount()) == 1) {
        throw new cz.muni.fi.pb138.odskart.backend.KartException("Removing last category");
    }
    org.jopendocument.dom.spreadsheet.Sheet toRemove = spreadSheet.getSheet(id);
    toRemove.detach();
    spreadSheet.saveAs(file);
}