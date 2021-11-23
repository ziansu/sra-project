public void setSetpoint(double setpoint) {
    if ((GetActiveController()) == null)
        return ;
    
    GetActiveController().setSetpoint(setpoint);
}