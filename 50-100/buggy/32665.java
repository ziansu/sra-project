private void startPost(java.lang.String postInfo) {
    android.util.Log.i(com.dante.girls.picture.PictureFragment.TAG, ("startPost: " + postInfo));
    android.support.v4.app.FragmentTransaction transaction = context.getSupportFragmentManager().beginTransaction();
    com.dante.girls.picture.PictureFragment fragment = com.dante.girls.picture.PictureFragment.newInstance(type);
    fragment.setInfo(postInfo);
    transaction.replace(R.id.container, fragment, "aPost");
    transaction.setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right, android.R.anim.slide_in_left, android.R.anim.slide_out_right);
    transaction.addToBackStack("");
    transaction.commit();
}