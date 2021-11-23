private void positionCellsForRow(nl.mad.toucanpdf.model.Cell[] content, nl.mad.toucanpdf.model.Position cellPos, double[] widths) {
    for (int rowNumber = 0; rowNumber < (content.length); ++rowNumber) {
        nl.mad.toucanpdf.model.state.StateCell cell = ((nl.mad.toucanpdf.model.state.StateCell) (content[rowNumber]));
        if (cell != null) {
            cell.setPosition(new nl.mad.toucanpdf.model.Position(cellPos));
            double jantje = cell.getRequiredWidth();
        }else {
        }
        cellPos.adjustX(widths[rowNumber]);
    }
}