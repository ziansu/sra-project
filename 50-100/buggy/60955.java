private int correctQuantityChar(java.lang.String price) {
    int surplusChars = 0;
    if ((price.length()) < 6) {
        surplusChars = 6 - (price.length());
    }
    return (((java.lang.Integer.parseInt(price)) * ((int) (java.lang.Math.pow(10, surplusChars)))) / 10) * (com.huorehu.fanalyzer.model.Candle.SCALE);
}