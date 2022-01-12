public java.lang.String checkConnection(eu.epitech.serverandroid.beans.UserClientInfo info) {
    eu.epitech.serverandroid.tools.GoogleTools google = new eu.epitech.serverandroid.tools.GoogleTools();
    if ((info == null) || ((info.getToken()) == null)) {
        return null;
    }
    return google.checkConnect(info);
}