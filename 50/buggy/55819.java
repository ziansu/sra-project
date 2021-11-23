private static void promptEnterKey(java.lang.String message) {
    it.univaq.architecture.recovery.granchelli.ArchitectureRecoveryApplication.logger.info(message);
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    scanner.nextLine();
    scanner.close();
}