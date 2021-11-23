public boolean getToggle() {
    boolean status = org.firstinspires.ftc.teamcode.statics.ControlParser.button(ctrl);
    if ((!(debounce)) && status) {
        debounce = true;
    }else
        if (!status) {
            debounce = false;
        }
    
    org.firstinspires.ftc.teamcode.debug.Logger.logLine((debounce ? "true" : "false"));
    return debounce;
}