void PrintWrite(int type) {
    CalcCheckSum(dataPackage);
    try {
        mPrintWriter.write(dataPackage);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}