protected java.util.Map<java.lang.Integer, java.lang.Double> represent(plusone.utils.PaperIF doc) {
    java.util.Map<java.lang.Integer, java.lang.Double> ret = new java.util.HashMap<java.lang.Integer, java.lang.Double>();
    for (java.lang.Integer w : doc.getTrainingWords()) {
        double tf = doc.getTrainingTf(w);
        sparseAddTo(ret, tf, localVectorsT.get(w));
    }
    return ret;
}