public void run() {
    int height = logoPicture.getHeight();
    int weight = logoPicture.getWidth();
    int iconSize = ((int) (getResources().getDimension(R.dimen.add_btn_size)));
    android.widget.RelativeLayout.LayoutParams lp = new android.widget.RelativeLayout.LayoutParams(new android.view.ViewGroup.MarginLayoutParams(iconSize, iconSize));
    lp.setMargins(((weight - iconSize) - (iconSize / 2)), (height - (iconSize / 2)), 0, 0);
    buttonPlus.setLayoutParams(lp);
}