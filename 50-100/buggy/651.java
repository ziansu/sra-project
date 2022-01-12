@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    newEditText.setVisibility(View.GONE);
    itemView.clearAnimation();
    if ((xyz.julianpeters.timedlists.helpers.StaticValues.getNested()) == 0) {
        (xyz.julianpeters.timedlists.helpers.StaticValues.nestedLevel)++;
        xyz.julianpeters.timedlists.helpers.Helper.launchIntent(context, xyz.julianpeters.timedlists.helpers.StaticValues.getCreated());
    }
}