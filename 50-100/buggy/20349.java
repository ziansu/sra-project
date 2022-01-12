public static org.mskcc.cbio.oncokb.util.Alteration findAlteration(org.mskcc.cbio.oncokb.util.Gene gene, java.lang.String alteration) {
    if (org.mskcc.cbio.oncokb.util.CacheUtils.isEnabled()) {
        java.util.Set<org.mskcc.cbio.oncokb.util.Alteration> alterations = org.mskcc.cbio.oncokb.util.CacheUtils.getAlterations(gene.getEntrezGeneId());
        for (org.mskcc.cbio.oncokb.util.Alteration al : alterations) {
            if (al.getAlteration().equalsIgnoreCase(alteration)) {
                return al;
            }
        }
        return null;
    }else {
        return org.mskcc.cbio.oncokb.util.AlterationUtils.alterationBo.findAlteration(gene, AlterationType.MUTATION, alteration);
    }
}