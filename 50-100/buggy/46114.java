private void applyColumnHeights(nl.mad.toucanpdf.model.state.StatePage page, nl.mad.toucanpdf.state.BaseStateTable.TableRow row) {
    for (nl.mad.toucanpdf.model.Cell c : row.getContent()) {
        if (c != null) {
            nl.mad.toucanpdf.model.state.StateCell cell = ((nl.mad.toucanpdf.model.state.StateCell) (c));
            cell.height(row.getMaxHeight());
            cell.processContentSize(page.getLeading(), this.borderWidth);
        }
    }
}