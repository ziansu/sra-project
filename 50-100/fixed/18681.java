private static <T> javafx.util.StringConverter<T> defaultStringConverter() {
    return new javafx.util.StringConverter<T>() {
        @java.lang.Override
        public java.lang.String toString(T t) {
            return t == null ? null : t.toString();
        }

        @java.lang.Override
        public T fromString(java.lang.String string) {
            return ((T) (string));
        }
    };
}