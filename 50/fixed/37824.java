public static com.rezzedup.map.RumPath with(final java.lang.String... components) {
    if (components == null) {
        return com.rezzedup.map.RumPath.ROOT;
    }
    return com.rezzedup.map.RumPath.create(new java.util.ArrayList<>(java.util.Arrays.asList(components)));
}