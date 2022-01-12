public static <FROM, TO> TO eval(org.rapidoid.lambda.Mapper<FROM, TO> mapper, FROM src) {
    try {
        return mapper.map(src);
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(java.lang.String.format("Cannot evaluate mapper %s on target: %s", mapper, src), e);
    }
}