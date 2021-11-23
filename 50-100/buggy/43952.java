public int getCalculatedBasicPriceWithProtectionFee(int finalPrice, double impost, int excise) {
    double tempFeeM = (ua.com.glady.uacc.model.Constants.TEMPORARY_PROTECTION_FEE_BASE) + 1;
    double vatM = (ua.com.glady.uacc.model.Constants.VAT_BASE) + 1;
    double result = ((finalPrice / vatM) - excise) / ((1 + tempFeeM) + impost);
    return ((int) (java.lang.Math.round(result)));
}