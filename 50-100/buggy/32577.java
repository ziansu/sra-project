public void recompute() {
    javafx.scene.layout.GridPane.setRowIndex(timetableBlock, ((int) (java.lang.Math.round(beginCount))));
    gui.centerarea.TimelinesGridPane.setRowIndex(timetableBlock, ((int) (java.lang.Math.round(beginCount))));
    gui.centerarea.TimelinesGridPane.setRowSpan(timetableBlock, ((int) (java.lang.Math.round(((endCount) - (beginCount))))));
}