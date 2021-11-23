private void assignNewId(org.apache.uima.jcas.JCas copyJCas) {
    org.dkpro.tc.api.type.JCasId jcasId = org.apache.uima.fit.util.JCasUtil.selectSingle(jCas, org.dkpro.tc.api.type.JCasId.class);
    jcasId.setId(subCASCounter);
}