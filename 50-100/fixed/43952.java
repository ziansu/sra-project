public int getCalculatedBasicPriceWithProtectionFee(int finalPrice, double impost, int excise) {
    double vatM = (ua.com.glady.uacc.model.Constants.VAT_BASE) + 1;
    double result = ((finalPrice / vatM) - excise) / ((1 + (ua.com.glady.uacc.model.Constants.TEMPORARY_PROTECTION_FEE_BASE)) + impost);
    return ((int) (java.lang.Math.round(result)));
}