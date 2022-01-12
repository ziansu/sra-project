public static com.adgvit.allan.retrofittest.data.remote.Service getService() {
    return com.adgvit.allan.retrofittest.data.remote.RetrofitClient.getClient().create(com.adgvit.allan.retrofittest.data.remote.Service.class);
}