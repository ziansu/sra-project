@java.lang.Override
public void run() throws java.lang.Throwable {
    com.diffplug.gradle.eclipserunner.EclipseIniLauncher launcher = new com.diffplug.gradle.eclipserunner.EclipseIniLauncher(eclipseRoot);
    try (com.diffplug.gradle.eclipserunner.EclipseIniLauncher.Running running = launcher.open()) {
        for (com.diffplug.gradle.osgi.OsgiExecable host : actionsWithinEclipse) {
            com.diffplug.gradle.osgi.OsgiExecable.exec(running.bundleContext(), host);
        }
    }
}