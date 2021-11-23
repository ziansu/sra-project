private void init(android.content.Context context) {
    android.view.LayoutInflater layoutInflater = android.view.LayoutInflater.from(context);
    mRootLayout = ((android.widget.LinearLayout) (layoutInflater.inflate(R.layout.layout_dynamic_form, this, true)));
    mContentLayout = ((android.widget.LinearLayout) (mRootLayout.findViewById(R.id.content)));
    mViewInflater = presidente.oscar.formbuilder.ViewInflater.getInstance(context);
}