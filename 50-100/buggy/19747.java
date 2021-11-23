public static <T> com.hashicorp.nomad.javasdk.Predicate<T> not(final com.hashicorp.nomad.javasdk.Predicate<T> predicate) {
    return new com.hashicorp.nomad.javasdk.Predicate<T>() {
        @java.lang.Override
        public boolean apply(T value) {
            return !(predicate.apply(value));
        }
    };
}