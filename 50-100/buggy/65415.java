static java.util.List<java.lang.Integer> createAlleleIndexMap(final java.util.List<org.broadinstitute.hellbender.utils.test.Allele> originalAlleles, final java.util.List<org.broadinstitute.hellbender.utils.test.Allele> sortedAlleles) {
    final java.util.List<java.lang.Integer> mapping = new java.util.ArrayList(originalAlleles.size());
    for (final org.broadinstitute.hellbender.utils.test.Allele a : originalAlleles) {
        final int newIndex = sortedAlleles.indexOf(a);
        mapping.add(newIndex);
    }
    return mapping;
}