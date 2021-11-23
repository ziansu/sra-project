@java.lang.Override
public void turnEmulationOff() {
    isOn = false;
    deviceStateDecorator.resetState();
    alex_shutov.com.ledlights.device_commands.main_logic.Command stopCommand = new alex_shutov.com.ledlights.device_commands.main_logic.emulation_general.StopAllEmulatedCommands();
    resumeCommandInBackgroundExec.execute(stopCommand);
}