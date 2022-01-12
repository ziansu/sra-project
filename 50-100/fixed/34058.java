@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... urls) {
    try {
        return loadXmlFromNetwork(urls[0]);
    } catch (java.io.IOException e) {
        return getResources().getString(R.string.connection_error);
    } catch (org.xmlpull.v1.XmlPullParserException e) {
        return getResources().getString(R.string.xml_error);
    }
}