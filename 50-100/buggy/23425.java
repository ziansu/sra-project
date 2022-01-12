private void upcomingCellFormat() {
    if ((listView) != null) {
        listView.setCellFactory(new javafx.util.Callback<javafx.scene.control.ListView<org.jimple.planner.task.Task>, javafx.scene.control.ListCell<org.jimple.planner.task.Task>>() {
            @java.lang.Override
            public javafx.scene.control.ListCell<org.jimple.planner.task.Task> call(javafx.scene.control.ListView<org.jimple.planner.task.Task> arg0) {
                return new org.jimple.planner.ui.UiListCellUpcoming();
            }
        });
    }
}