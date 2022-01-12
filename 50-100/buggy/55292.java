@java.lang.Override
public void onClick(android.view.View v) {
    if ((v.getId()) == (R.id.vcv_img_play)) {
        android.graphics.drawable.Drawable drawable;
        if (isPlaying()) {
            drawable = context.getResources().getDrawable(R.drawable.fvl_selector_play);
            pause();
        }else {
            drawable = context.getResources().getDrawable(R.drawable.fvl_selector_pause);
            start();
        }
        v.setBackgroundDrawable(drawable);
    }else {
        fullscreen();
    }
}