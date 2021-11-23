@java.lang.Override
public okhttp3.Request authenticate(okhttp3.Route route, okhttp3.Response response) throws java.io.IOException {
    if ((response.request().header("Authorization")) != null) {
        return null;
    }
    java.lang.System.out.println(("Authenticating for response: " + response));
    java.lang.System.out.println(("Challenges: " + (response.challenges())));
    java.lang.String credential = okhttp3.Credentials.basic("jesse", "password1");
    return response.request().newBuilder().header("Authorization", credential).build();
}