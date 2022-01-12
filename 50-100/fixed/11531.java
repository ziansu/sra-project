@java.lang.Deprecated
private static int buildMaxIndexPages(int allPageNo, java.lang.Integer maxIndexPages) {
    if ((com.feilong.core.util.Validator.isNullOrEmpty(maxIndexPages)) || (maxIndexPages <= 0)) {
        if (allPageNo > 1000) {
            return 6;
        }else
            if (allPageNo > 100) {
                return 8;
            }else {
                return 10;
            }
        
    }
    return maxIndexPages;
}