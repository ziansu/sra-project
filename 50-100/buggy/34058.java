@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... urls) {
    try {
        return loadXmlFromNetwork(urls[0]);
    } catch (java.io.IOException e) {
        android.widget.Toast.makeText(this, "Connection error", Toast.LENGTH_SHORT).show();
        return getResources().getString(R.string.connection_error);
    } catch (org.xmlpull.v1.XmlPullParserException e) {
        android.widget.Toast.makeText(this, "XML error", Toast.LENGTH_SHORT).show();
        return getResources().getString(R.string.xml_error);
    }
}