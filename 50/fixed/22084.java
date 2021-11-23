private static int alignToEven(final openmods.gui.component.GuiComponentBook book) {
    int index = book.getNumberOfPages();
    if ((index & 1) == 1) {
        book.addPage(PageBase.BLANK_PAGE);
        index++;
    }
    return index;
}