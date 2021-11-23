public void reset(final java.util.List<java.lang.Long> analyticalRunIds) {
    java.lang.Long size = proteinGroupService.getProteinGroupCountForRun(analyticalRunIds, filter);
    super.reset(proteinGroupService.getProteinGroupCountForRun(analyticalRunIds, filter));
}