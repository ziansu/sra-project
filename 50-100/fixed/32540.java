public boolean getToggle() {
    boolean status = org.firstinspires.ftc.teamcode.statics.ControlParser.button(ctrl);
    if ((!(debounce)) && status) {
        debounce = true;
        return true;
    }else
        if (!status) {
            debounce = false;
        }
    
    return false;
}