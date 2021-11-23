@org.junit.Test
public void getRequestedGpFileObj_fromProxyHref() throws java.lang.Exception, java.net.MalformedURLException {
    gpFilePath = org.genepattern.server.dm.GpFileObjFactory.getRequestedGpFileObj(gpConfig, ((proxyHref) + (uploadPath(org.genepattern.server.dm.TestGpFileObjFactory.filename))), new org.genepattern.util.LSID(cleLsid));
    org.junit.Assert.assertEquals("gpFilePath.name", org.genepattern.server.dm.TestGpFileObjFactory.filename, gpFilePath.getName());
}