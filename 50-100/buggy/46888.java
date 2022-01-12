public void alienShoot() {
    if ((bossLevel) != true) {
        java.util.Random rand = new java.util.Random();
        int randNr = rand.nextInt(aliens.size());
        alienBullets.addElement(aliens.get(randNr).shoot());
    }else {
        alienBullets.addAll(aliens.get(0).BossShoot());
    }
}