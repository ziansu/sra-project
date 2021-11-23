private void runOnRunDirectory(@org.jetbrains.annotations.NotNull
final java.lang.String runDirectory, @org.jetbrains.annotations.NotNull
final java.lang.String outputVcf) throws com.hartwig.hmftools.common.exception.HartwigException, java.io.IOException {
    com.hartwig.hmftools.consensusrule.ConsensusRuleFilterApplication.LOGGER.info(("Loading melted input from " + runDirectory));
    processVariants(com.hartwig.hmftools.common.variant.vcf.VCFFileLoader.loadSomaticVCF(runDirectory, com.hartwig.hmftools.consensusrule.ConsensusRuleFilterApplication.SOMATIC_EXTENSION).variants(), outputVcf);
}