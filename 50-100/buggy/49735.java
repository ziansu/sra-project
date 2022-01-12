public static void randomiseKeyValues(java.util.Map<java.lang.String, java.lang.String> headers) {
    headers.forEach(( key, value) -> {
        headers.remove(key);
        headers.put(com.onelostlogician.aws.proxy.Util.randomizeCase(key), com.onelostlogician.aws.proxy.Util.randomizeCase(value));
    });
}