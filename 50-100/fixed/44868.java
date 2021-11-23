@java.lang.Override
public void show() {
    super.show();
    final android.view.View sheetView = findViewById(R.id.design_bottom_sheet);
    final android.support.design.widget.CoordinatorLayout.LayoutParams layoutParams = ((android.support.design.widget.CoordinatorLayout.LayoutParams) (sheetView.getLayoutParams()));
    behavior = ((android.support.design.widget.BottomSheetBehavior) (layoutParams.getBehavior()));
    super.show();
    sheetView.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            setState(BottomSheetBehavior.STATE_EXPANDED);
        }
    });
}