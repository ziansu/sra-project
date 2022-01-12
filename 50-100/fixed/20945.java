private java.lang.String setHttpParams(java.lang.String page, java.lang.String key) {
    if (key.equalsIgnoreCase(getActivity().getString(R.string.string_site_home))) {
        com.ievolutioned.iac.net.HttpGetParam params = new com.ievolutioned.iac.net.HttpGetParam();
        params.add("ref", "xedni/draobhsad");
        params.add("token_access", com.ievolutioned.iac.util.AppPreferences.getAdminToken(getActivity()));
        page += "?" + (params.toString());
    }
    return page;
}