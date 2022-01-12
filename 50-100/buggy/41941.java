@java.lang.Override
public void showColorRow(android.support.v7.widget.AppCompatImageView view, com.huhx0015.screencolortester.domain.models.ScreenColor color) {
    if (color.isRandom) {
        view.setImageResource(R.drawable.ic_random);
    }else
        if ((color.resource) != null) {
            view.setBackgroundColor(color.resource);
        }else {
            view.setBackgroundColor(android.graphics.Color.rgb(color.red, color.green, color.blue));
        }
    
}