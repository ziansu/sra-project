private void showMessageButton(agency.tango.materialintroscreen.SlideFragment fragment) {
    if ((messageButton.getVisibility()) != (android.view.View.VISIBLE)) {
        messageButton.setVisibility(View.VISIBLE);
        messageButton.startAnimation(android.view.animation.AnimationUtils.loadAnimation(fragment.getActivity(), R.anim.fade_in));
    }
}