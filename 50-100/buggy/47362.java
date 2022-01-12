public void loadCalendar(javafx.scene.layout.AnchorPane placeholder) {
    placeholder.getChildren().clear();
    jfxtras.scene.control.agenda.Agenda agenda = calendarView.getAgenda();
    seedu.taskell.commons.util.FxViewUtil.applyAnchorBoundaryParameters(agenda, 0.0, 0.0, 0.0, 0.0);
    placeholder.getChildren().add(agenda);
}