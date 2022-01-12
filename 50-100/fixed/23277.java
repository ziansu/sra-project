@org.jetbrains.annotations.NotNull
private static com.hartwig.healthchecks.common.report.BaseDataReport proportionOfReadsUsed(@org.jetbrains.annotations.NotNull
final java.lang.String sampleId, final long totalSequences, @org.jetbrains.annotations.NotNull
final java.util.List<com.hartwig.healthchecks.boggs.flagstatreader.FlagStats> passed) {
    final com.hartwig.healthchecks.boggs.flagstatreader.FlagStats totalStat = passed.get(FlagStatsType.TOTAL_INDEX.getIndex());
    final com.hartwig.healthchecks.boggs.flagstatreader.FlagStats secondaryStat = passed.get(FlagStatsType.SECONDARY_INDEX.getIndex());
    double proportionReadPercentage = ((totalStat.getValue()) - (secondaryStat.getValue())) / totalSequences;
    return new com.hartwig.healthchecks.common.report.BaseDataReport(sampleId, MappingCheck.MAPPING_PROPORTION_READ_VS_TOTAL_SEQUENCES.toString(), java.lang.String.valueOf(proportionReadPercentage));
}