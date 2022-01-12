public static org.apache.uima.jcas.cas.FSArray toFSArray(org.apache.uima.jcas.JCas jCas, org.apache.uima.cas.FeatureStructure... fses) {
    if ((fses.length) == 0) {
        return new org.apache.uima.jcas.cas.FSArray(jCas, 0);
    }else {
        org.apache.uima.jcas.cas.FSArray array = new org.apache.uima.jcas.cas.FSArray(jCas, fses.length);
        int i = 0;
        for (org.apache.uima.cas.FeatureStructure fs : fses) {
            array.set(i, fs);
        }
        return array;
    }
}