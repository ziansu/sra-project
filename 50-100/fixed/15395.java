private boolean contactNameFilter(java.lang.String name) {
    if ((name == null) || (name.isEmpty())) {
        return false;
    }
    java.util.List<java.lang.String> blacklist = java.util.Arrays.asList(activity.getResources().getStringArray(R.array.contact_name_blacklist));
    for (java.lang.String s : blacklist) {
        if (name.matches(s)) {
            return false;
        }
    }
    return true;
}