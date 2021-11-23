void rxtxoff() {
    if (DEBUG) {
        if ((((stateMachine) == (se.sics.mspsim.chip.CC2520.RadioState.TX_ACK)) || ((stateMachine) == (se.sics.mspsim.chip.CC2520.RadioState.TX_FRAME))) || ((stateMachine) == (se.sics.mspsim.chip.CC2520.RadioState.RX_FRAME))) {
        }
    }
    setState(se.sics.mspsim.chip.CC2520.RadioState.IDLE);
}