public static void survivorsAttack(intf.ISurvivor[] survivors, intf.IZombie[] zombies) {
    for (int z = 0; z < (zombies.length); z++) {
        for (int i = 0; i < (survivors.length); i++) {
            if ((survivors[i].isAlive()) && (zombies[z].isAlive())) {
                survivors[i].attack(zombies[z]);
            }
        }
    }
}