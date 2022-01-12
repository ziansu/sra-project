@org.junit.Test
public void testFileOperaFuckup() throws java.net.MalformedURLException {
    net.ontopia.infoset.core.LocatorIF base = new net.ontopia.infoset.impl.basic.URILocator("file:/home/larsga/cvs-co/topicmaps/opera/opera.xtm");
    net.ontopia.infoset.core.LocatorIF base2 = base.resolveAbsolute("opera-template.xtm");
    net.ontopia.infoset.core.LocatorIF abs = base2.resolveAbsolute("geography.xtm");
    org.junit.Assert.assertTrue("Two-step normalization produced wrong result", abs.getAddress().equals("file:/home/larsga/cvs-co/topicmaps/opera/geography.xtm"));
}