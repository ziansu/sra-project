@java.lang.Override
public de.setsoftware.reviewtool.model.changestructure.Fragment traceFragment(de.setsoftware.reviewtool.model.changestructure.Fragment fragment) {
    return new de.setsoftware.reviewtool.model.changestructure.Fragment(this.traceFile(fragment.getFile()), fragment.getFrom(), fragment.getTo(), fragment.getContent());
}