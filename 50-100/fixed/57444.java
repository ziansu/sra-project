private MainGame.BonusBall generateBonusBall() {
    MainGame.BonusBallType type = MainGame.BonusBallType.getRandomBallType();
    int mass = (MainGame.Game.random.nextInt(((MainGame.Game.MAXMASS) - (MainGame.Game.MINMASS)))) + (MainGame.Game.MINMASS);
    return new MainGame.BonusBall(10, 0.5, mass, 0.5, type.getColor(), new Physics.GameVector(0, 0), new Physics.GameVector(0, type.getLoadedVelocity()));
}