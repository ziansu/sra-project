public void changeChromosome(java.lang.String chrName, boolean recordHistory) {
    boolean changed = setChromosomeName(chrName, false);
    if (changed) {
        org.broad.igv.ui.event.ViewChange resultEvent = org.broad.igv.ui.event.ViewChange.ChromosomeChangeResult(chrName);
        resultEvent.setRecordHistory(recordHistory);
        getEventBus().post(resultEvent);
        changeZoom(0);
    }
}