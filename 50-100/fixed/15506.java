private void build() {
    android.view.ViewGroup viewGroup = ((android.view.ViewGroup) (activity.findViewById(android.R.id.content)));
    sheetLayout = new com.github.fabactivitytransition.SheetLayout(activity, properties);
    sheetLayout.setFab(fab);
    sheetLayout.setFabAnimationEndListener(new com.github.fabactivitytransition.SheetLayout.OnFabAnimationEndListener() {
        @java.lang.Override
        public void onFabAnimationEnd() {
            startActivityCallback.onNeedToStartActivity();
        }
    });
    viewGroup.addView(sheetLayout, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
}