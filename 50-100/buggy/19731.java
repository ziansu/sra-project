public static void survivorsAttack(intf.ISurvivor[] survivors, intf.IZombie[] zombies) {
    for (int z = 0; (z < (zombies.length)) && (zombies[z].isAlive()); z++) {
        for (int i = 0; (i < (survivors.length)) && (survivors[i].isAlive()); i++) {
            survivors[i].attack(zombies[z]);
        }
    }
}