@java.lang.Override
public void showBackgroundColor(com.huhx0015.screencolortester.domain.models.ScreenColor color) {
    if ((color.resource) != 0) {
        mActivityLayout.setBackgroundColor(color.resource);
    }else {
        mActivityLayout.setBackgroundColor(android.graphics.Color.rgb(color.red, color.green, color.blue));
    }
}