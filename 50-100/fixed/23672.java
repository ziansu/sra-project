public void defend(Enemy enemy) {
    int attackStr = enemy.attack();
    hitP = ((hitP) > attackStr) ? (hitP) - attackStr : 0;
    java.lang.System.out.printf(((name) + " is hit for %d HP of damage. (%s)\n"), attackStr, getStatus());
    if ((hitP) == 0) {
        java.lang.System.out.println(((name) + " is Dead!\n"));
    }
}