public static java.security.PrivilegedAction<java.lang.reflect.Constructor> getStringConstructorPA(final java.lang.Class<?> c) {
    return new java.security.PrivilegedAction<java.lang.reflect.Constructor>() {
        @java.lang.Override
        public java.lang.reflect.Constructor run() {
            try {
                return c.getConstructor(java.lang.String.class);
            } catch (final java.lang.SecurityException e) {
                throw e;
            } catch (final java.lang.Exception e) {
                return null;
            }
        }
    };
}