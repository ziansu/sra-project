@java.lang.Override
public void onClick(android.view.View v) {
    if ((i) == (primaryColors.length))
        i = 0;
    
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        mBtnChangeColor.setBackgroundTintList(android.content.res.ColorStateList.valueOf(primaryColors[i]));
        showAnimation();
    }else {
        mToolbar.setBackgroundColor(primaryColors[i]);
        (i)++;
    }
}