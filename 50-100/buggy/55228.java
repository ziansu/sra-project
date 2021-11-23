private double unigramProbForTerm(java.lang.String term) {
    java.lang.Integer count = map.get(term);
    if (count == null) {
        return java.lang.Math.log(Config.eps);
    }else {
        return (java.lang.Math.log(count)) - (java.lang.Math.log(uniqWordCount));
    }
}