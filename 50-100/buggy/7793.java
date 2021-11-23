public void enter(android.view.View in, com.iodesystems.android.libs.view.transitions.TransitionPair transitionPair) {
    if (!(views.isEmpty())) {
        android.view.View out = views.peek();
        if ((onPageTransitionListener) != null) {
            onPageTransitionListener.onPageTransition(in, out);
        }
        transitionPair.enter(out, in);
    }
    views.push(in);
    transitionPairs.push(transitionPair);
}