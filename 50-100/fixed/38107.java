private static java.io.File createTemp(org.w3c.dom.Document doc) throws java.io.IOException {
    java.io.File tmp = java.io.File.createTempFile("android-manifest", "xml");
    tmp.delete();
    com.android.utils.FileUtils.createFile(tmp, org.eclipse.andmore.internal.editors.formatting.EclipseXmlPrettyPrinter.prettyPrint(doc, org.eclipse.andmore.internal.editors.formatting.EclipseXmlFormatPreferences.create(), XmlFormatStyle.MANIFEST, null, false));
    tmp.deleteOnExit();
    return tmp;
}