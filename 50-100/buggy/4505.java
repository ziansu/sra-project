public void run() {
    active_entities.Coach.State state = active_entities.Coach.State.WAIT_FOR_REFEREE_COMMAND;
    while (true) {
        switch (state) {
            case WAIT_FOR_REFEREE_COMMAND :
                this.contestants_bench.callContestants();
                state = active_entities.Coach.State.ASSEMBLE_TEAM;
                break;
            case ASSEMBLE_TEAM :
                this.referee_site.informReferee();
                state = active_entities.Coach.State.WATCH_TRIAL;
                break;
            case WATCH_TRIAL :
                this.referee_site.reviewNotes();
                state = active_entities.Coach.State.WAIT_FOR_REFEREE_COMMAND;
                break;
            default :
                state = active_entities.Coach.State.WAIT_FOR_REFEREE_COMMAND;
                break;
        }
    } 
}