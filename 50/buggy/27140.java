public org.ei.opensrp.domain.FetchStatus sync() {
    org.ei.opensrp.domain.FetchStatus fetchStatus = pullFromServer();
    android.content.org.ei.opensrp.Context.getInstance().pullAllDataFromCloudant();
    android.content.org.ei.opensrp.Context.getInstance().pushAllDataToCloudant();
    return fetched;
}