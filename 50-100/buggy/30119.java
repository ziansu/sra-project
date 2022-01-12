@java.lang.Override
public void tick_update() {
    (update)++;
    if ((update) >= 2) {
        if (((!(edu.wpi.first.wpilibj.ControllerPower.getEnabled6V())) || (!(edu.wpi.first.wpilibj.ControllerPower.getEnabled3V3()))) || (!(edu.wpi.first.wpilibj.ControllerPower.getEnabled5V())))
            setColor(new java.awt.Color(100, 33, 33));
        else
            setColor(new java.awt.Color(33, 33, 33));
        
        update();
    }
}