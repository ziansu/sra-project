void clear(android.transition.Transition.TransitionListener transitionListener) {
    transition.removeListener(transitionListener);
    this.transitionListener = null;
}