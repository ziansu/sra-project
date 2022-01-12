private void resetTextColor() {
    if ((textColorStateList) == null) {
        textColorStateList = new android.content.res.ColorStateList(new int[][]{ new int[]{ android.R.attr.state_enabled } , EMPTY_STATE_SET }, new int[]{ ((baseColor) & 16777215) | -553648128 , ((baseColor) & 16777215) | 1140850688 });
        setTextColor(textColorStateList);
    }else {
        setTextColor(textColorStateList);
    }
}