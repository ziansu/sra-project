@java.lang.Override
public void onOffsetChanged(android.support.design.widget.AppBarLayout appBarLayout, int verticalOffset) {
    if (((java.lang.Math.abs(verticalOffset)) >= ((appBarLayout.getTotalScrollRange()) / 2)) && (!(isColorChanged))) {
        setBackArrowColor(true);
    }else
        if ((java.lang.Math.abs(verticalOffset)) <= ((appBarLayout.getTotalScrollRange()) / 2)) {
            setBackArrowColor(false);
        }
    
}