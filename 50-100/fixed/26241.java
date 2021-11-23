public static int getEncodedSizeWithoutArrayData(org.apache.poi.ss.formula.ptg.Ptg[] ptgs) {
    int result = 0;
    for (org.apache.poi.ss.formula.ptg.Ptg ptg : ptgs) {
        if (ptg instanceof org.apache.poi.ss.formula.ptg.ArrayPtg) {
            result += ArrayPtg.PLAIN_TOKEN_SIZE;
        }else {
            result += ptg.getSize();
        }
    }
    return result;
}