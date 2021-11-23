protected void enableParallaxHeader() {
    ultimateRecyclerView.setParallaxHeader(getLayoutInflater().inflate(R.layout.parallax_recyclerview_header, ultimateRecyclerView.mRecyclerView, false));
    ultimateRecyclerView.setOnParallaxScroll(new com.marshalchen.ultimaterecyclerview.UltimateRecyclerView.OnParallaxScroll() {
        @java.lang.Override
        public void onParallaxScroll(float percentage, float offset, android.view.View parallax) {
            android.graphics.drawable.Drawable c = toolbar.getBackground();
            c.setAlpha(java.lang.Math.round((127 + (percentage * 128))));
            toolbar.setBackgroundDrawable(c);
        }
    });
}