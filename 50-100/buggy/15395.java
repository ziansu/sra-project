private boolean contactNameFilter(java.lang.String name) {
    java.util.List<java.lang.String> blacklist = java.util.Arrays.asList(activity.getResources().getStringArray(R.array.contact_name_blacklist));
    for (java.lang.String s : blacklist) {
        if (s.matches(name)) {
            return false;
        }
    }
    return true;
}