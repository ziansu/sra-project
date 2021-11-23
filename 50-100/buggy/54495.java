@org.opendatakit.views.JavascriptInterface
public void arbitraryQuery(java.lang.String tableId, java.lang.String sqlCommand, java.lang.String sqlBindParamsJSON, java.lang.Integer limit, java.lang.Integer offset, java.lang.String callbackJSON) {
    if (isInactive())
        return ;
    
    weakData.get().arbitraryQuery(tableId, sqlCommand, sqlBindParamsJSON, limit, offset, callbackJSON);
}