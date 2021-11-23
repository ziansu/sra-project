public static com.app.salpo.skillzapp.rest.ApiClient getApiClient() {
    try {
        if (((com.app.salpo.skillzapp.rest.ApiFactory.token) == null) || ((com.app.salpo.skillzapp.rest.ApiFactory.mApiClient) == null)) {
            com.app.salpo.skillzapp.rest.ApiFactory.mApiClient = ((com.app.salpo.skillzapp.rest.ApiClient) (com.app.salpo.skillzapp.rest.ApiFactory.apiClass.newInstance()));
        }
        return com.app.salpo.skillzapp.rest.ApiFactory.mApiClient;
    } catch (java.lang.InstantiationException e) {
        e.printStackTrace();
    } catch (java.lang.IllegalAccessException e) {
        e.printStackTrace();
    }
    return null;
}