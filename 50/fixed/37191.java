@java.lang.Override
public void handle(de.setsoftware.reviewtool.model.changestructure.TextualChangeHunk visitee) {
    ret.setValue(new de.setsoftware.reviewtool.model.changestructure.Stop(visitee.getFrom(), visitee.getTo(), this.tracer.traceFragment(visitee.getTo())));
}