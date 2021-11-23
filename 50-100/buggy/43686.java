public static void main(java.lang.String[] args) throws java.io.IOException, javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXException {
    com.tifsoft.mavenbuildbuddy.model.BuildPOM buildPOM = com.tifsoft.mavenbuildbuddy.pom.BuildPOMContentsLister.parsePOM();
    for (com.tifsoft.mavenbuildbuddy.model.BuildProfile buildProfile : buildPOM.profileList.values()) {
        com.tifsoft.mavenbuildbuddy.pom.BuildPOMContentsLister.LOG.info(("Profile: " + (buildProfile.profile)));
        for (com.tifsoft.mavenbuildbuddy.model.BuildModule module : buildProfile.moduleList.values()) {
            com.tifsoft.mavenbuildbuddy.pom.BuildPOMContentsLister.LOG.info(("Module: " + (module.getName())));
        }
    }
}