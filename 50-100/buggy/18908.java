public static java.lang.String FindStrInBA(byte[] arr, int sep) throws java.io.UnsupportedEncodingException {
    byte[] ret = new byte[sep];
    for (int i = 0; i < (ret.length); i++) {
        ret[i] = arr[i];
    }
    java.lang.String retu = new java.lang.String(ret, "UTF-8");
    java.lang.System.out.println(("String being compared to: " + retu));
    java.lang.System.out.println(("compare to gives: " + ("fått".compareTo(retu))));
    return retu;
}