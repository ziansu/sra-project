protected void step(int step) {
    if (((planState) == (RobotInfo.PlanState.PLAN)) || ((planState) == (RobotInfo.PlanState.EXPLORE)))
        setTargetPose(targetPose, planState);
    
    gotoScan(((currentScanNo) + step));
}