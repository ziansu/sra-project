private void adjustLayout(android.widget.RelativeLayout content) {
    if (content != null) {
        android.widget.RelativeLayout.LayoutParams contentParams = new android.widget.RelativeLayout.LayoutParams(content.getLayoutParams().width, content.getLayoutParams().height);
        contentParams.addRule(RelativeLayout.BELOW, mRootView.getId());
        content.setLayoutParams(contentParams);
    }
}