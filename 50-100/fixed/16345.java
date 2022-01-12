private int getDataDimension() {
    int naxis3 = ((inImageHeader.naxis) > 2) ? inFitsHeader.getIntValue("NAXIS3", 0) : 0;
    int naxis4 = ((inImageHeader.naxis) > 3) ? inFitsHeader.getIntValue("NAXIS4", 0) : 0;
    return naxis4 != 0 ? 4 : naxis3 != 0 ? 3 : 2;
}