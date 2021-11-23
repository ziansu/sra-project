@org.jetbrains.annotations.NotNull
protected java.lang.String formatClassPath(@org.jetbrains.annotations.NotNull
java.lang.String first, @org.jetbrains.annotations.NotNull
java.lang.String... others) {
    java.lang.String result = first;
    for (java.lang.String other : others) {
        result += (getClassPathSeparator()) + other;
    }
    return result;
}