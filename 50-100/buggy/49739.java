public org.nd4j.linalg.api.ndarray.INDArray getWordVectorMatrixNormalized(java.lang.String word) {
    int i = vocab().indexOf(word);
    if (i < 0)
        return lookupTable().vector(org.deeplearning4j.models.embeddings.wordvectors.WordVectorsImpl.UNK);
    
    org.nd4j.linalg.api.ndarray.INDArray r = lookupTable().vector(word);
    return r.div(org.nd4j.linalg.factory.Nd4j.getBlasWrapper().nrm2(r));
}