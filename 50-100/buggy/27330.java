private void clear(android.transition.Transition transition) {
    transition.removeListener(this);
    if ((transitions) != null) {
        for (android.transition.Transition tr : transitions) {
            if (com.jenshen.awesomeanimation.util.transition.TransitionUtil.equalsTransitions(transition, tr)) {
                tr.removeListener(this);
                transitions.remove(tr);
                return ;
            }
        }
    }
}