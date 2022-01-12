public org.usfirst.frc.team68.robot.Point getPointAtPercent(double percent) {
    int index = ((int) (java.lang.Math.round((((points.size()) / 100) * percent)))) - 1;
    if (index > (points.size()))
        index = points.size();
    
    return points.get(index);
}