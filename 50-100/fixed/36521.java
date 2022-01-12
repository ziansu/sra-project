@java.lang.Override
public boolean DeserializeInternal() {
    liftSolenoidid = java.lang.Integer.parseInt(mCfgClass.GetAttribute("liftSolenoid"));
    tiltSolenoidid = java.lang.Integer.parseInt(mCfgClass.GetAttribute("tiltSolenoid"));
    liftSolenoid = new edu.wpi.first.wpilibj.Solenoid(java.lang.Math.abs(liftSolenoidid));
    tiltSolenoid = new edu.wpi.first.wpilibj.Solenoid(java.lang.Math.abs(tiltSolenoidid));
    return true;
}