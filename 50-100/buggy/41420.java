public static void zombiesAttack(intf.IZombie[] zombies, intf.ISurvivor[] survivors) {
    for (int i = 0; (i < (survivors.length)) && (survivors[i].isAlive()); i++) {
        for (int z = 0; (z < (zombies.length)) && (zombies[z].isAlive()); z++) {
            zombies[z].attack(survivors[i]);
        }
    }
}