public static android.widget.RelativeLayout.LayoutParams scaleFrom(android.view.View v, android.widget.RelativeLayout.LayoutParams params, int pixel) {
    android.util.Log.d("pixel", ("onScroll: " + pixel));
    params = hantizlabs.jeuduroi.CardUtils.cloneParams(params);
    params.leftMargin -= pixel;
    params.rightMargin -= pixel;
    params.topMargin -= pixel;
    params.bottomMargin -= pixel;
    android.util.Log.d("pixel", ("onScroll: " + pixel));
    v.setLayoutParams(params);
    return params;
}