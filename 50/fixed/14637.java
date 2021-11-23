public static void convert(org.apache.uima.jcas.JCas aJCas, org.dkpro.core.io.lxf.internal.model.LxfGraph aSource, org.dkpro.core.io.lxf.internal.model.LxfGraph aTarget) {
    org.dkpro.core.io.lxf.internal.DKPro2Lxf.convert(aJCas, aSource, aTarget, org.dkpro.core.io.lxf.internal.DKPro2Lxf.createIdMap("dkpro", aSource), "dkpro");
}