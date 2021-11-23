public void roll() {
    Game.Die.dice1 = ((int) ((java.lang.Math.random()) * 6)) + 1;
    Game.Die.dice2 = ((int) ((java.lang.Math.random()) * 6)) + 1;
    Game.Die.sum = (Game.Die.dice1) + (Game.Die.dice2);
}