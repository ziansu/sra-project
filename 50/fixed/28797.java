private static boolean filterVepAnnotation(nhs.genetics.cardiff.VEPAnnotationv82 vepAnnotationv82) {
    if (((vepAnnotationv82.getBiotype()) == null) || (!(vepAnnotationv82.getBiotype().equals("PROTEIN_CODING"))))
        return true;
    
    return false;
}