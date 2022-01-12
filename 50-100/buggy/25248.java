@java.lang.Override
public void reportState(net.wohlfart.pluto.ai.btree.State state) {
    switch (state) {
        case RUNNING :
            this.state = State.RUNNING;
            break;
        case SUCCESS :
            this.state = State.RUNNING;
            break;
        case FAILURE :
            this.state = State.FAILURE;
            break;
        default :
            this.state = State.INVALID;
            context.add(this);
    }
}