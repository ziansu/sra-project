void rxtxoff() {
    if (DEBUG) {
        log(("Strobe RXTX-OFF!!! at " + (cpu.cycles)));
        if ((((stateMachine) == (se.sics.mspsim.chip.CC2520.RadioState.TX_ACK)) || ((stateMachine) == (se.sics.mspsim.chip.CC2520.RadioState.TX_FRAME))) || ((stateMachine) == (se.sics.mspsim.chip.CC2520.RadioState.RX_FRAME))) {
            log(("WARNING: turning off RXTX during " + (stateMachine)));
        }
    }
    setState(se.sics.mspsim.chip.CC2520.RadioState.IDLE);
}