@java.lang.Override
public void onTransitionStart(android.transition.Transition transition) {
    if ((transitionList) != null) {
        for (com.jenshen.awesomeanimation.util.transition.TransitionWrapper transitionWrapper : transitionList) {
            if (com.jenshen.awesomeanimation.util.transition.TransitionUtil.equalsTransitions(transitionWrapper.getTransition(), transition)) {
                transitionWrapper.onStart();
                break;
            }
        }
    }
}