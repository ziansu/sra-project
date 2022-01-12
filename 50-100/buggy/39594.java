public static void main(java.lang.String[] args) {
    java.util.function.Predicate<java.lang.String> predicate1 = ( t) -> t.startsWith("www");
    java.util.function.Predicate<java.lang.String> predicate2 = ( url) -> url.startsWith("www");
    java.lang.System.out.println(predicate1.test("www.facebook.com"));
    java.lang.System.out.println(predicate2.test("facebook.com"));
}