public org.usfirst.frc.team68.robot.Point getPointAtPercent(double percent) {
    int index = ((int) (java.lang.Math.round(((((double) (points.size())) / 100) * percent))));
    if (index > (points.size()))
        index = points.size();
    
    if (index < 0)
        index = 0;
    
    return points.get(index);
}