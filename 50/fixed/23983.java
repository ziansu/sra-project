private void setLastAccessedAddress(com.batagliao.onebible.models.BibleAddress value) {
    lastAccessedAddress.set(value);
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.lang.String json = gson.toJson(lastAccessedAddress);
    com.pixplicity.easyprefs.library.Prefs.putString(Consts.LAST_ACCESSED_ADDRESS_KEY, json);
}