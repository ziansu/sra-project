@java.lang.Override
public void setMode(lejosserver.Command.Mode mode, java.lang.String modeName) {
    switch (mode) {
        case TOUCH :
            {
                this.mode = touchSensor.getTouchMode();
                this.numberOfValues = 1;
                this.modeName = modeName;
                break;
            }
        default :
            {
                new lejosserver.ErrorMode(lejosserver.ErrorMode.ErrorType.SYSTEM_ERROR, this.getClass().getName());
            }
    }
}