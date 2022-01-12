public static java.lang.String getAlternateCodingSequence(final java.lang.String referenceCodingSequence, final int alleleStartPos, final htsjdk.variant.variantcontext.Allele refAllele, final htsjdk.variant.variantcontext.Allele altAllele) {
    org.broadinstitute.hellbender.utils.Utils.nonNull(referenceCodingSequence);
    org.broadinstitute.hellbender.utils.Utils.nonNull(refAllele);
    org.broadinstitute.hellbender.utils.Utils.nonNull(altAllele);
    final int alleleIndex = java.lang.Math.abs((alleleStartPos - 1));
    return ((referenceCodingSequence.substring(0, alleleIndex)) + (altAllele.getBaseString())) + (referenceCodingSequence.substring((alleleIndex + (refAllele.length()))));
}