public boolean exit() {
    if (transitionPairs.isEmpty()) {
        return false;
    }
    com.iodesystems.android.libs.view.transitions.TransitionPair transitionPair = transitionPairs.pop();
    android.view.View out = views.pop();
    android.view.View in = views.peek();
    if ((onPageTransitionListener) != null) {
        onPageTransitionListener.onPageTransition(in, out);
    }
    transitionPair.exit(out, in);
    return true;
}