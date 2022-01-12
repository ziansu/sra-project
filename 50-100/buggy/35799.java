@java.lang.Override
public void actuate(eu.tango.self.adaptation.manager.rules.datatypes.Response response) {
    switch (response.getActionType()) {
        case ADD_CPU :
        case REMOVE_CPU :
        case ADD_TASK :
        case REMOVE_TASK :
        case SCALE_TO_N_TASKS :
        case PAUSE_APP :
        case UNPAUSE_APP :
        case HARD_KILL_APP :
        case INCREASE_WALL_TIME :
        case REDUCE_WALL_TIME :
            slurm.actuate(response);
            break;
        case RESELECT_ACCELERATORS :
            alde.actuate(response);
        default :
            java.util.logging.Logger.getLogger(eu.tango.self.adaptation.manager.actuators.SlurmActuator.class.getName()).log(java.util.logging.Level.SEVERE, "The Response type was not recoginised by this adaptor");
            break;
    }
    response.setPerformed(true);
}