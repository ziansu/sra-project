protected java.lang.String extractFeatures(java.lang.String docID, java.io.InputStream imageObj) throws eu.europeana.service.ir.image.exceptions.ImageIndexingException {
    java.lang.String imgFeatures;
    try {
        if ((img2Features) == null)
            img2Features = initFeatureExtractor(getDataset());
        
    } catch (java.lang.Exception e) {
        throw new eu.europeana.service.ir.image.exceptions.ImageIndexingException(("Cannot init feature extractor for dataset!" + (getDataset())), e);
    }
    try {
        imgFeatures = img2Features.extractFeatures(imageObj);
    } catch (java.lang.Exception e) {
        throw new eu.europeana.service.ir.image.exceptions.ImageIndexingException(("Cannot extract features from input stream. docId" + docID), e);
    }
    return imgFeatures;
}