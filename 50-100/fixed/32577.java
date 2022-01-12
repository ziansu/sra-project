public void recompute() {
    gui.centerarea.TimelinesGridPane.setRowIndex(timetableBlock, ((int) (java.lang.Math.round(beginCount))));
    gui.centerarea.TimelinesGridPane.setRowSpan(timetableBlock, ((int) (java.lang.Math.round(((endCount) - (beginCount))))));
}