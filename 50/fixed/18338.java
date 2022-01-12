public void reset(final java.util.List<java.lang.Long> analyticalRunIds) {
    if ((analyticalRunIds.size()) > 0) {
        super.reset(proteinGroupService.getProteinGroupCountForRun(analyticalRunIds, filter));
    }
}