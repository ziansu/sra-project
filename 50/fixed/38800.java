@java.lang.Override
public com.nutomic.syncthingandroid.syncthing.RestApi getApi() {
    return new com.nutomic.syncthingandroid.test.MockRestApi(this, null, null, null, null, null);
}