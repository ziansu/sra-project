public void run() {
    died.spigot().respawn();
    com.thebubblenetwork.skyfortress.SkyFortress.getInstance().getGame().setSpectating(died, true);
    died.teleport(l);
}