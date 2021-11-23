public double[] playBackElevator() {
    double[] playArray = new double[3];
    if ((org.usfirst.frc.team3243.robot.Recorder.playIncrement) > ((this.ElevData.size()) - 1)) {
        playArray[0] = 0;
    }else {
        playArray[0] = this.ElevData.get(org.usfirst.frc.team3243.robot.Recorder.playIncrement);
    }
    return playArray;
}