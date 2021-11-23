private void showMessageButton(final agency.tango.materialintroscreen.SlideFragment fragment) {
    if ((messageButton.getVisibility()) != (android.view.View.VISIBLE)) {
        messageButton.setVisibility(View.VISIBLE);
        if ((fragment.getActivity()) != null) {
            messageButton.startAnimation(android.view.animation.AnimationUtils.loadAnimation(fragment.getActivity(), R.anim.fade_in));
        }
    }
}