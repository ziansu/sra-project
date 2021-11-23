public static float calcDegree(de.hsnr.inr.sir.dictionary.Term termT, de.hsnr.inr.sir.dictionary.Term termU) {
    int docsWithTAndU = de.hsnr.inr.sir.dictionary.JaccardDegree.calcIntersectionSize(termT, termU);
    int docsWithTOrU = (termT.getFrequence()) + (termU.getFrequence());
    float degree = docsWithTAndU / docsWithTOrU;
    return degree;
}