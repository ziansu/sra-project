public static void main(java.lang.String[] args) {
    org.apache.log4j.PropertyConfigurator.configure("../log4j.properties");
    com.sun.javafx.application.LauncherImpl.launchApplication(EmployeeGui.EmployeeApplicationScreen.class, EmployeeGui.EmployeeGuiPreloader.class, args);
}