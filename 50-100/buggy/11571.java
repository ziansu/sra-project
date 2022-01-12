private java.lang.String getFinalValue(java.lang.String newVal, java.lang.String oldVal) {
    if (com.breadwallet.tools.util.Utils.isNullOrEmpty(newVal))
        return null;
    
    if (com.breadwallet.tools.util.Utils.isNullOrEmpty(oldVal))
        return newVal;
    
    if (newVal.equals(oldVal)) {
        return null;
    }else {
        return newVal;
    }
}