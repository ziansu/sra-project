protected void loadAgendaList() {
    listFormatter.formatList(logic.getAgendaList(), Constants.TYPE_AGENDA);
    agendaContent.getChildren().clear();
    javafx.scene.control.ListView<org.jimple.planner.task.Task> list = listFormatter.getFormattedList();
    if (list != null) {
        agendaContent.getChildren().add(list);
    }else {
        agendaContent.getChildren().add(agendaEmpty);
    }
}