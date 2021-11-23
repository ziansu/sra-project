public org.usfirst.frc.team3316.robot.stacker.StackerPosition getPosition() {
    updateHeights();
    double height = getHeight();
    if ((height > (heightFloorMin)) && (height < (heightFloorMax))) {
        return org.usfirst.frc.team3316.robot.stacker.StackerPosition.Floor;
    }else
        if ((height > (heightToteMin)) && (height < (heightToteMax))) {
            return org.usfirst.frc.team3316.robot.stacker.StackerPosition.Tote;
        }else
            if ((height > (heightStepMin)) && (height < (heightStepMax))) {
                return org.usfirst.frc.team3316.robot.stacker.StackerPosition.Step;
            }else {
                return null;
            }
        
    
}