private static void promptEnterKey() {
    it.univaq.architecture.recovery.granchelli.ArchitectureRecoveryApplication.logger.info("Press \"ENTER\" if you finished your modifications.(Don\'t Forget to Save and Close)");
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    scanner.nextLine();
}