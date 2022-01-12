public static void main(java.lang.String[] args) {
    java.util.function.Predicate<java.lang.String> predicate1 = new java.util.function.Predicate<java.lang.String>() {
        @java.lang.Override
        public boolean test(java.lang.String t) {
            return t.startsWith("www");
        }
    };
    java.util.function.Predicate<java.lang.String> predicate2 = ( url) -> url.startsWith("www");
    java.lang.System.out.println(predicate1.test("www.facebook.com"));
    java.lang.System.out.println(predicate2.test("facebook.com"));
}