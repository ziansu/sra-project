@org.junit.Test
public void testMetaHandlerUtf16le() throws java.lang.Exception {
    for (java.lang.String fn : new java.lang.String[]{ "/meta/meta.xml" , "/meta-utf16le.xml" , "/xml-entity-meta/meta.xml" }) {
        java.lang.System.out.println(fn);
        java.io.InputStream is = getClass().getResourceAsStream(fn);
        org.gbif.dwca.io.ArchiveFactory.readMetaDescriptor(new org.gbif.dwca.io.Archive(), is);
    }
}