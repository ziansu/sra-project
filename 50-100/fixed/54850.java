private void init(android.util.AttributeSet attrs) {
    android.content.res.TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.ExpandableTextView);
    mMaxCollapsedLines = typedArray.getInt(R.styleable.ExpandableTextView_maxCollapsedLines, com.thd.lib.ToggleExpandableTextView.MAX_COLLAPSED_LINES);
    mAnimationDuration = typedArray.getInt(R.styleable.ExpandableTextView_animDuration, com.thd.lib.ToggleExpandableTextView.DEFAULT_ANIM_DURATION);
    mAnimAlphaStart = typedArray.getFloat(R.styleable.ExpandableTextView_animAlphaStart, com.thd.lib.ToggleExpandableTextView.DEFAULT_ANIM_ALPHA_START);
    useToggleDefualtAnimator = typedArray.getBoolean(R.styleable.ExpandableTextView_useToggleViewDefaultAnimator, com.thd.lib.ToggleExpandableTextView.DEFAULT_USE_TOGGLEVIEW_ANIMATOR);
    typedArray.recycle();
}