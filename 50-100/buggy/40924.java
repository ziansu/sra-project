public static org.mskcc.cbio.oncokb.model.Gene getGeneByHugoSymbol(java.lang.String hugoSymbol) {
    if (hugoSymbol != null) {
        org.mskcc.cbio.oncokb.bo.GeneBo geneBo = org.mskcc.cbio.oncokb.util.ApplicationContextSingleton.getGeneBo();
        if (org.mskcc.cbio.oncokb.util.CacheUtils.isEnabled()) {
            return org.mskcc.cbio.oncokb.util.CacheUtils.getGeneByHugoSymbol(hugoSymbol);
        }else {
            return geneBo.findGeneByHugoSymbol(hugoSymbol);
        }
    }
    return null;
}