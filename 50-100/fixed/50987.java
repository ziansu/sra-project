public android.location.Address getUpdatedAddress(com.example.ravi_gupta.slider.MainActivity activity) {
    if ((this.updatedAddress) == null) {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = getData(activity, Constants.address);
        updatedAddress = gson.fromJson(json, android.location.Address.class);
    }
    return updatedAddress;
}