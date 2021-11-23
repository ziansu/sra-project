void stop() {
    super.stop();
    for (State s : states) {
        s.reset_first_time();
        s.stop();
    }
    begin.reset_first_time();
    begin.stop();
    end.reset_first_time();
    end.stop();
    update_actual(null);
    reset_state_timer();
    this.status = Status.INACTIVE;
    if (debug)
        java.lang.System.out.println(("stopping State_Machine" + (this.name)));
    
}