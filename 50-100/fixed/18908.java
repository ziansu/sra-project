public static java.lang.String FindStrInBA(byte[] arr, int sep) throws java.io.UnsupportedEncodingException {
    byte[] ret = new byte[sep];
    for (int i = 0; i < (ret.length); i++) {
        ret[i] = arr[i];
    }
    java.lang.String retu = new java.lang.String(ret, "UTF-8");
    return retu;
}