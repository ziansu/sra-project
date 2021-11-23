@java.lang.Override
public void removeScore(org.spongepowered.api.scoreboard.Score score) {
    this.allowRecursion = false;
    ((org.spongepowered.common.scoreboard.SpongeScore) (score)).removeFromObjective(this);
    this.allowRecursion = true;
    this.scores.remove(score.getName());
}