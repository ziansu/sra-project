public static long parseSnowflake(java.lang.String input) {
    org.apache.http.util.Args.notEmpty(input, "ID");
    try {
        if (input.startsWith("-"))
            return java.lang.Long.parseUnsignedLong(input);
        else
            return java.lang.Long.parseLong(input);
        
    } catch (java.lang.NumberFormatException ex) {
        throw new java.lang.NumberFormatException(java.lang.String.format("The specified ID is not a valid snowflake (%s). Expecting a valid long value!", input));
    }
}