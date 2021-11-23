private void noConnectionError() throws java.lang.Exception {
    connected = false;
    throw new java.io.IOException(com.shtrih.util.Localizer.getString(Localizer.NoConnection));
}