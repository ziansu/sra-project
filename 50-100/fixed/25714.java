public static void setRelevantAlterations(java.lang.Integer entrezGeneId, java.lang.String variant, java.util.List<org.mskcc.cbio.oncokb.util.Alteration> alts) {
    if (!(org.mskcc.cbio.oncokb.util.CacheUtils.relevantAlterations.containsKey(entrezGeneId))) {
        org.mskcc.cbio.oncokb.util.CacheUtils.relevantAlterations.put(entrezGeneId, new java.util.HashMap<java.lang.String, java.util.List<java.lang.Integer>>());
    }
    java.util.List<java.lang.Integer> mappedAltsIds = new java.util.ArrayList<>();
    for (org.mskcc.cbio.oncokb.util.Alteration alteration : alts) {
        mappedAltsIds.add(alteration.getId());
    }
    org.mskcc.cbio.oncokb.util.CacheUtils.relevantAlterations.get(entrezGeneId).put(variant, mappedAltsIds);
}