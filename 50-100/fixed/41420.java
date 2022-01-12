public static void zombiesAttack(intf.IZombie[] zombies, intf.ISurvivor[] survivors) {
    for (int i = 0; i < (survivors.length); i++) {
        for (int z = 0; z < (zombies.length); z++) {
            if ((survivors[i].isAlive()) && (zombies[z].isAlive())) {
                zombies[z].attack(survivors[i]);
            }
        }
    }
}