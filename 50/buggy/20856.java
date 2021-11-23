public com.seven.virtual_currency_website.domain.JubiJsonObject jsonarrayToObject(org.json.JSONArray ja) {
    return new com.seven.virtual_currency_website.domain.JubiJsonObject(ja.getString(0), ja.getDouble(1), ja.getDouble(2), ja.getString(3), ja.getString(4));
}