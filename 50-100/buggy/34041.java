@java.lang.Override
public boolean apply(dynamite.zafroshops.app.data.MobileZop input) {
    return ((input.Type) == type) && (((!(preferences.contains(StorageKeys.COUNTRY_KEY))) || ((preferences.getString(StorageKeys.COUNTRY_KEY, "")) == "")) || (input.CountryID.equals(preferences.getString(StorageKeys.COUNTRY_KEY, ""))));
}