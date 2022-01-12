public static org.apache.uima.jcas.cas.FSArray toFSArray(org.apache.uima.jcas.JCas jCas, java.util.Collection<? extends org.apache.uima.cas.FeatureStructure> collection) {
    if ((collection == null) || (collection.isEmpty())) {
        return new org.apache.uima.jcas.cas.FSArray(jCas, 0);
    }else {
        org.apache.uima.jcas.cas.FSArray array = new org.apache.uima.jcas.cas.FSArray(jCas, collection.size());
        int i = 0;
        for (org.apache.uima.cas.FeatureStructure fs : collection) {
            array.set(i, fs);
            i++;
        }
        return array;
    }
}