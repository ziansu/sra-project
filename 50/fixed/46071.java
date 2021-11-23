public void animateRecyclerView() {
    android.content.Context context = getActivity();
    if (context != null)
        recyclerView.startAnimation(android.view.animation.AnimationUtils.loadAnimation(context, R.anim.bottom_to_top));
    
}