private void init(android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    setBackgroundColor(android.graphics.Color.parseColor("#efefef"));
    setOrientation(la.juju.android.ftil.widgets.VERTICAL);
    android.view.View.inflate(getContext(), R.layout.layout_face_text_input, this);
    mViewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.pager)));
    mDotViewLayout = ((la.juju.android.ftil.widgets.DotViewLayout) (findViewById(R.id.dotview_layout)));
    mMyPagerAdapter = new la.juju.android.ftil.widgets.FaceTextInputLayout.MyPagerAdapter();
    mTargetFaceTextView = inflateTargetFaceTextView();
    applyXMLAttributes(attrs, defStyleAttr, defStyleRes);
}