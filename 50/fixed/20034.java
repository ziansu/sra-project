public void run() {
    died.teleport(l);
    died.spigot().respawn();
    com.thebubblenetwork.skyfortress.SkyFortress.getInstance().getGame().setSpectating(died, true);
    died.teleport(l);
}