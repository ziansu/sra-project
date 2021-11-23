public static void main(java.lang.String[] args) {
    javafx.application.Application.launch(null);
    org.apache.log4j.PropertyConfigurator.configure("log4j.properties");
    com.mscs_710l.systemantics.ui.HomeScreen.LOGGER.debug("SySTematics main(): starts");
    com.mscs_710l.systemantics.bl.CpuInfo cpuInfo = new com.mscs_710l.systemantics.bl.CpuInfo();
    cpuInfo.cpuInformation();
    com.mscs_710l.systemantics.ui.HomeScreen.LOGGER.debug("HomeScreen main(): ends");
}