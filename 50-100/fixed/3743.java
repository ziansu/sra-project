private void stoppingPoseDetection() {
    if (cbStoppingPose.getSelectedItem().equals("Crossed Hands")) {
        coor.stopRecordingUsers(PoseType.CROSSED_HANDS);
    }else
        if (cbStoppingPose.getSelectedItem().equals("PSI")) {
            coor.stopRecordingUsers(PoseType.PSI);
        }else
            if (cbStoppingPose.getSelectedItem().equals("Manual")) {
                coor.stopRecordingUsers(null);
            }
        
    
}