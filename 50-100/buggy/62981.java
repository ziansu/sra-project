private void setLoading(java.lang.Boolean bool) {
    android.util.Log.d("DEBUG", (("setLoading(" + (bool.toString())) + ") EvacuationActivity"));
    android.graphics.drawable.AnimationDrawable animation = ((android.graphics.drawable.AnimationDrawable) (imvLoading.getBackground()));
    if (bool) {
        svAll.setVisibility(View.GONE);
        imvLoading.setVisibility(View.VISIBLE);
        animation.start();
    }else {
        svAll.setVisibility(View.VISIBLE);
        imvLoading.setVisibility(View.GONE);
        animation.stop();
    }
}