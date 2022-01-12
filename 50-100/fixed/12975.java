public static <T> java.util.Map<java.lang.String, T> fromBundle(android.os.Bundle input, java.lang.Class<T> claz) {
    input.setClassLoader(claz.getClassLoader());
    java.util.Map<java.lang.String, T> output = new android.support.v4.util.ArrayMap<java.lang.String, T>();
    for (java.lang.String key : input.keySet()) {
        output.put(key, ((T) (input.get(key))));
    }
    return output;
}