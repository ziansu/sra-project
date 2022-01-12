private static boolean doEquals(java.lang.Object first, java.lang.Object second, boolean caseSensitive) {
    if ((first == second) || ((first == null) && (second == null))) {
        return true;
    }
    if ((!caseSensitive) && (com.openpojo.business.utils.BusinessIdentityUtils.isCharacterBased(first))) {
        return first.toString().equalsIgnoreCase(second.toString());
    }
    return first.equals(second);
}