private void manageExportPkg(org.codehaus.plexus.util.xml.Xpp3Dom instructions) {
    org.codehaus.plexus.util.xml.Xpp3Dom exporttPkg = instructions.getChild("Export-Package");
    if (exporttPkg == null) {
        return ;
    }
    manageExportPkgs(exporttPkg);
}