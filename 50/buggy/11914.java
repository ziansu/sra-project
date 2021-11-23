public static boolean isCodeSystemAvailable(java.lang.String codeSystem) {
    return (ApplicationConstants.CODE_SYSTEM_MAP.get(codeSystem)) == null ? false : true;
}