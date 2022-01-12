public void addListener(com.vmusco.pminer.analyze.MutantTestProcessingListener<com.vmusco.pminer.analyze.MutationStatisticsCollecter> mtpl) {
    if (mtpl != null) {
        this.mtpl.add(mtpl);
    }
}