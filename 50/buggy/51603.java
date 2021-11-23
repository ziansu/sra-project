private void manageExportPkg(org.codehaus.plexus.util.xml.Xpp3Dom instructions) throws java.io.IOException, org.codehaus.plexus.util.xml.pull.XmlPullParserException {
    org.codehaus.plexus.util.xml.Xpp3Dom exporttPkg = instructions.getChild("Export-Package");
    if (exporttPkg == null) {
        return ;
    }else {
        manageExportPkgs(exporttPkg);
    }
}