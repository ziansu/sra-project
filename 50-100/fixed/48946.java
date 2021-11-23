@java.lang.Override
public void run() {
    linearLayout = ((android.widget.LinearLayout) (getChildAt(0)));
    sliderSync = new com.stuin.cleanvisuals.Slide.SliderSync(linearLayout, getChildAt(1));
    android.widget.ProgressBar progressBar = ((android.widget.ProgressBar) (linearLayout.getChildAt(1)));
    progressBar.getLayoutParams().width = (getWidth()) / 4;
    progressBar.invalidate();
}