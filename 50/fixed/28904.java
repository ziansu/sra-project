public org.awiki.kamikaze.summit.service.processor.result.SourceProcessorResultTable.Row getHeader() {
    if ((getRowByY(0)) instanceof org.awiki.kamikaze.summit.service.processor.result.SourceProcessorResultTable.HeaderRow) {
        return getRowByY(0);
    }
    return null;
}