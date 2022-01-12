public static boolean allDead(zombiewar.intf.ICharacter[] characters) {
    boolean allDead = true;
    for (int i = 0; i < (characters.length); i++) {
        allDead &= !(characters[i].isAlive());
    }
    return allDead;
}