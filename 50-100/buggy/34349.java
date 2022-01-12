private void init(android.content.Context context) {
    android.view.LayoutInflater layoutInflater = android.view.LayoutInflater.from(context);
    android.view.View root = layoutInflater.inflate(R.layout.layout_dynamic_form, this, true);
    mRootLayout = ((android.widget.LinearLayout) (findViewById(R.id.content)));
    mContentLayout = ((android.widget.LinearLayout) (root.findViewById(R.id.content)));
    mViewInflater = presidente.oscar.formbuilder.ViewInflater.getInstance(context);
}