private static boolean isError(java.lang.String text) {
    for (java.lang.String indicator : git4idea.commands.GitImpl.ERROR_INDICATORS) {
        if (text.trim().toLowerCase().startsWith(indicator.toLowerCase())) {
            return true;
        }
    }
    return false;
}