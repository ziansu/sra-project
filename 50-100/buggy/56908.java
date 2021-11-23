@java.lang.Override
public void onDisable() {
    com.v3ld1n.V3LD1N.saveWarps();
    com.v3ld1n.V3LD1N.saveChangelog();
    com.v3ld1n.V3LD1N.plugin = null;
    com.v3ld1n.V3LD1N.configs = null;
    com.v3ld1n.V3LD1N.worldGuard = null;
    com.v3ld1n.V3LD1N.commands = null;
    com.v3ld1n.V3LD1N.items = null;
    com.v3ld1n.V3LD1N.warps = null;
    com.v3ld1n.V3LD1N.signs = null;
    com.v3ld1n.V3LD1N.changelogDays = null;
    com.v3ld1n.V3LD1N.resourcePacks = null;
    com.v3ld1n.V3LD1N.resourcePackNames = null;
    com.v3ld1n.V3LD1N.itemTasks = null;
    com.v3ld1n.V3LD1N.particleTasks = null;
    com.v3ld1n.V3LD1N.soundTasks = null;
    com.v3ld1n.V3LD1N.teleportTasks = null;
    com.v3ld1n.V3LD1N.econ = null;
    com.v3ld1n.V3LD1N.rideCommand = null;
    com.v3ld1n.V3LD1N.usingRideCommand = null;
}