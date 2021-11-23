@java.lang.Override
protected java.lang.Exception doInBackground(de.geeksfactory.opacclient.objects.Account... params) {
    try {
        de.geeksfactory.opacclient.apis.OpacApi api = ((de.geeksfactory.opacclient.OpacClient) (getApplication())).getNewApi(lib);
        api.checkAccountData(account);
    } catch (java.io.IOException e) {
        return e;
    } catch (org.json.JSONException e) {
        return e;
    } catch (de.geeksfactory.opacclient.apis.OpacApi.OpacErrorException e) {
        return e;
    }
    return null;
}