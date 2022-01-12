@java.lang.Override
public void populate() {
    kabasuji.views.BoardView boardView = new kabasuji.views.BoardView(level.getBoard());
    kabasuji.views.BullpenView bullpenView = new kabasuji.views.BullpenView(level);
    kabasuji.views.ProgressView progress = new kabasuji.views.ProgressView(null);
    kabasuji.views.AchievementView achievement = new kabasuji.views.AchievementView(null);
    this.add(boardView);
    this.add(bullpenView);
    this.add(progress);
    this.add(achievement);
}