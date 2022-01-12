@java.lang.Override
public void run() {
    if (((switchcmd.equals(eu.masar.decster.MainActivity.switchcmds.SWITCH_ON)) || (switchcmd.equals(eu.masar.decster.MainActivity.switchcmds.SWITCH_OFF))) || (switchcmd.equals(eu.masar.decster.MainActivity.switchcmds.SWITCH_GET))) {
        buttonToggleDevice.setChecked(result.contains("1"));
    }else
        if (switchcmd.equals(eu.masar.decster.MainActivity.switchcmds.GET_SWITCH_LIST)) {
        }
    
}