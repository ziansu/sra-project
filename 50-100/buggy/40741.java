public void updateTrainID() {
    java.lang.String newID = java.lang.String.valueOf(com.rogueone.mbo.Mbo.mboGui.TrainDropdown.getSelectedItem());
    if ((newID.compareTo("100")) == 0) {
        com.rogueone.mbo.Mbo.mboGui.CurrentSpeedValue.setText("30 mph");
        com.rogueone.mbo.Mbo.mboGui.SuggestedSpeedValue.setText("35 mph");
        com.rogueone.mbo.Mbo.mboGui.DifferenceValue.setText("(+5 mph)");
    }else {
        com.rogueone.mbo.Mbo.mboGui.CurrentSpeedValue.setText("40 mph");
        com.rogueone.mbo.Mbo.mboGui.SuggestedSpeedValue.setText("30 mph");
        com.rogueone.mbo.Mbo.mboGui.DifferenceValue.setText("(-10 mph)");
    }
    java.lang.System.out.println(newID);
    com.rogueone.mbo.Mbo.mboGui.TrainIdValue.setText(newID);
}