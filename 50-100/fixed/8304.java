protected byte[] convertBytes(java.util.ArrayList<java.lang.Integer> list) {
    if (list == null)
        return null;
    
    byte[] ret = new byte[list.size()];
    java.util.Iterator<java.lang.Integer> iterator = list.iterator();
    for (int i = 0; i < (ret.length); i++) {
        ret[i] = iterator.next().byteValue();
    }
    return ret;
}