@java.lang.Override
public synchronized com.amazonaws.services.s3.AmazonS3 client() {
    java.lang.String endpoint = getDefaultEndpoint();
    java.lang.String account = componentSettings.get("access_key", settings.get("cloud.account"));
    java.lang.String key = componentSettings.get("secret_key", settings.get("cloud.key"));
    return getClient(endpoint, "https", account, key, null);
}