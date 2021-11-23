private static javafx.scene.layout.GridPane createFloatingTaskDetail(taskGenerator.Task tempTask) {
    javafx.scene.layout.GridPane taskDetail = new javafx.scene.layout.GridPane();
    javafx.scene.text.Text eventTitle = new javafx.scene.text.Text(("Title: " + (tempTask.getEventTitle())));
    javafx.scene.text.Text rank = new javafx.scene.text.Text(listItUI.OutputScreenPane.getRankingText(tempTask.getImportance()));
    javafx.scene.layout.GridPane.setConstraints(eventTitle, 0, 0);
    javafx.scene.layout.GridPane.setConstraints(rank, 0, 1);
    taskDetail.getChildren().addAll(eventTitle, rank);
    return taskDetail;
}