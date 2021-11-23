public void restore() {
    if (((game.state.LevelState.gunShootTime) <= (-(bulletRecharge))) && ((currentAmmo) < (maxAmmo))) {
        game.state.LevelState.gunShootTime = 0;
        (currentAmmo)++;
    }
}