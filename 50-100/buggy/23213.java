@javax.annotation.Nonnull
public java.lang.String makeGt(@javax.annotation.Nonnull
org.pharmgkb.parser.vcf.model.VcfPosition position) {
    return (((m_allele1) == null ? org.pharmgkb.parser.vcf.model.genotype.VcfGenotype.sf_noData : getAlleleIndex(position, m_allele1.toString())) + (m_isPhased ? org.pharmgkb.parser.vcf.model.genotype.VcfGenotype.sf_phasedDelimiter : org.pharmgkb.parser.vcf.model.genotype.VcfGenotype.sf_unphasedDelimiter)) + ((m_allele2) == null ? org.pharmgkb.parser.vcf.model.genotype.VcfGenotype.sf_noData : org.pharmgkb.parser.vcf.model.genotype.VcfGenotype.getAlleleFromIndex(position, m_allele2.toString()));
}