public void addScore(int score) {
    this.score += score;
    com.github.TheDwoon.robots.game.entity.Robot.log.info("robot #{} has a new score of {} point{}", getUUID(), this.score, ((java.lang.Math.abs(this.score)) == 1 ? "" : 's'));
}