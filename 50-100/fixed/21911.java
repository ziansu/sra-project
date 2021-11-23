public static float calcDegree(de.hsnr.inr.sir.dictionary.Term termT, de.hsnr.inr.sir.dictionary.Term termU) {
    float docsWithTAndU = de.hsnr.inr.sir.dictionary.JaccardDegree.calcIntersectionSize(termT, termU);
    float docsWithTOrU = ((termT.getFrequence()) + (termU.getFrequence())) - docsWithTAndU;
    float degree = docsWithTAndU / docsWithTOrU;
    return degree;
}