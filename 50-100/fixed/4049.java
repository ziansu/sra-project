public java.util.ArrayList<utils.DoubleDoublePair> getRoc(java.util.ArrayList<java.lang.Double> lambdas) {
    java.util.ArrayList<utils.DoubleDoublePair> roc = new java.util.ArrayList<utils.DoubleDoublePair>();
    double oldLambda = this.lambda;
    for (double lambda : lambdas) {
        this.lambda = lambda;
        processResults();
        roc.add(new utils.DoubleDoublePair((1 - (getHamRecall())), getSpamRecall()));
    }
    this.lambda = oldLambda;
    processResults();
    return roc;
}