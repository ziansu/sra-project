public static com.adgvit.allan.retrofittest.data.remote.Service getService() {
    return com.adgvit.allan.retrofittest.data.remote.RetrofitClient.getClient(com.adgvit.allan.retrofittest.ApiUtils.BASE_URL).create(com.adgvit.allan.retrofittest.data.remote.Service.class);
}