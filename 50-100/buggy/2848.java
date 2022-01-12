private boolean isContains(java.lang.String address, java.lang.String fromRule) {
    java.lang.String[] fromRules = fromRule.split(";");
    for (int i = 0; i < (fromRules.length); i++) {
        if (address.contains(fromRule)) {
            return true;
        }
    }
    return false;
}