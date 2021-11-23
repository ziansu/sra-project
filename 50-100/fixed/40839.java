@java.lang.Override
public void tick(uk.co.nickthecoder.itchy.Actor actor) {
    this.sop.tick(actor);
    if (this.sop.isFinished()) {
        if ((this.loops) > 0) {
            (this.loopsRemaining)--;
        }
        if (((this.loopsRemaining) > 0) || ((this.loops) == 0)) {
            this.sop.start(actor);
        }
    }
    super.tick(actor);
}