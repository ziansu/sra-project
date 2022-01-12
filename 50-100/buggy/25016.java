public void setRequestCity(java.lang.String city) {
    java.lang.String[] cityInfos = city.split("#");
    if (android.text.TextUtils.equals(requestCity, cityInfos[2])) {
        return ;
    }
    requestCity = cityInfos[2];
    cityId = cityInfos[3];
    if (android.text.TextUtils.equals("N/A", currentWeatherCity)) {
        currentWeatherCity = city;
    }
    loadingFlag = android.text.TextUtils.equals(currentWeatherCity, requestCity);
    requestData();
}