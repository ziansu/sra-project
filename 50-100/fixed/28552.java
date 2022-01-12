@java.lang.Override
protected void onPostExecute(android.util.Pair<java.lang.Integer, java.lang.String> responsePair) {
    if ((listener) == null)
        return ;
    
    if (responsePair == null) {
        listener.onTransactionError("Keine Verbindung zum Server");
        return ;
    }
    if ((responsePair.first) == (org.apache.http.HttpStatus.SC_OK)) {
        listener.onTransactionSuccess();
    }else {
        listener.onTransactionError(responsePair.second);
    }
}