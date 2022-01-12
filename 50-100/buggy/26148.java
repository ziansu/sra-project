public void show(com.schibsted.tapdadev.Target target, java.lang.Character character) {
    android.widget.ImageView view = target.getImageView();
    if ((view.getVisibility()) == (android.view.View.INVISIBLE)) {
        view.setImageResource(character.getImageResource());
        view.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, R.anim.slide_up));
        view.setVisibility(View.VISIBLE);
        java.lang.String log = ((target.getId()) + " - ") + (character.getId());
        view.setTag(log);
    }
}