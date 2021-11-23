public static void logError(java.lang.String error) {
    if (br.ufpe.cin.aac3.gryphon.GryphonConfig.isLogEnabled()) {
        java.lang.System.err.println(error);
    }
}