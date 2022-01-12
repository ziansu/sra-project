private void showcaseFab() {
    showcaseViewBuilder.hide();
    showcaseViewBuilder.setTargetView(fab).setBackgroundOverlayColor(-579808563).setRingColor(-860231785).setRingWidth(30).setMarkerDrawable(getResources().getDrawable(R.drawable.arrow_up), Gravity.LEFT).addCustomView(R.layout.fab_description_view, Gravity.TOP).setCustomViewMargin(170);
    showcaseViewBuilder.show();
    showcaseViewBuilder.setClickListenerOnView(R.id.btn, new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            showcaseViewBuilder.hide();
        }
    });
}