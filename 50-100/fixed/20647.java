@java.lang.Override
public synchronized void updateBattlecodeFiles(java.io.File battlecode_server, java.io.File allowedPackages, java.io.File disallowedClasses, java.io.File methodCosts) {
    pendingBattlecodeServerFile = battlecode_server;
    pendingAllowedPackagesFile = allowedPackages;
    pendingDisallowedClassesFile = disallowedClasses;
    pendingMethodCostsFile = methodCosts;
    if ((getCurrentRun()) == null) {
        writeBattlecodeFiles();
    }
}