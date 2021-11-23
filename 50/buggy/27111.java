public static java.lang.String generateFilename(java.lang.String prifix) {
    return (prifix + "_") + (java.lang.String.valueOf((((new java.util.Date().getTime()) / 1000000000) / 1000)));
}