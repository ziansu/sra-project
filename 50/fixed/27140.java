public org.ei.opensrp.domain.FetchStatus sync() {
    android.content.org.ei.opensrp.Context.getInstance().pullAllDataFromCloudant();
    android.content.org.ei.opensrp.Context.getInstance().pushAllDataToCloudant();
    return fetched;
}