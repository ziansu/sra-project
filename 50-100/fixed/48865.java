public void setLoadingColor(int color) {
    loadingColor = color;
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        loadingView.setIndeterminateTintList(new android.content.res.ColorStateList(new int[][]{ new int[]{  } }, new int[]{ loadingColor }));
    }
}