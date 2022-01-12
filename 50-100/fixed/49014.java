public void updateScore(main.java.group37.bejeweled.combination.Combination combi) {
    this.score += combi.score();
    main.java.group37.bejeweled.model.Logger.log(("Add score: " + (combi.score())));
    main.java.group37.bejeweled.model.Logger.log(("Total Score: " + (this.score)));
    notifyObservers(this, score);
}