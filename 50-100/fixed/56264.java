public void createFrame(frame.Frame frame, int method) {
    if (teachFrame.setFrame(((abs(method)) % 2))) {
        global.Fields.debug("Frame set: %d\n", curFrameIdx);
        if (frame instanceof frame.ToolFrame) {
            activeRobot.setActiveToolFrame(curFrameIdx);
            global.DataManagement.saveRobotData(activeRobot, 2);
        }else {
            activeRobot.setActiveUserFrame(curFrameIdx);
            global.DataManagement.saveRobotData(activeRobot, 2);
        }
    }else {
        println("Invalid input points");
    }
}