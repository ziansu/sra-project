public void initAchievementTab() {
    achievementPane.setVgap(50);
    achievementPane.prefWidthProperty().bind(javafx.beans.binding.Bindings.add((-70), anchor.widthProperty()));
    btnRefresh.setOnAction(( e) -> {
        update();
    });
}