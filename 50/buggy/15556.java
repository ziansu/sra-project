public boolean cancel() {
    com.github.ekumen.rosjava_actionlib.bolean ret = false;
    switch (stateMachine.getState()) {
        case com.github.ekumen.rosjava_actionlib.ClientStateMachine.ClientStates.WAITING_FOR_GOAL_ACK :
        case com.github.ekumen.rosjava_actionlib.ClientStateMachine.ClientStates.PENDING :
        case com.github.ekumen.rosjava_actionlib.ClientStateMachine.ClientStates.ACTIVE :
            this.state = com.github.ekumen.rosjava_actionlib.ClientStateMachine.ClientStates.WAITING_FOR_CANCEL_ACK;
            ret = true;
            break;
    }
    return ret;
}