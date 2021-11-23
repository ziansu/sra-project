@java.lang.Override
public boolean isFinished() {
    Robot.driveSys.ultraSanic.setDistanceUnits(Unit.kInches);
    double ultraDistance = Robot.driveSys.ultraSanic.getRangeInches();
    java.lang.System.out.println(ultraDistance);
    if (ultraDistance <= (org.usfirst.frc.team2537.robot.auto.UltraSonicCourseCorrect.TOLERANCE)) {
        return false;
    }else {
        return false;
    }
}