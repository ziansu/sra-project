public static <T> org.tlsys.twt.rt.java.util.TOptional<T> ofNullable(T value) {
    if (value == null) {
        return org.tlsys.twt.rt.java.util.TOptional.empty();
    }else {
        return org.tlsys.twt.rt.java.util.TOptional.of(value);
    }
}