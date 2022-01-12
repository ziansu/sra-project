@java.lang.Override
public void setLayerId(java.lang.String id) {
    val = ((android.widget.TextView) (getRootView().findViewById(R.id.color_map_val)));
    android.widget.SeekBar bar = ((android.widget.SeekBar) (getRootView().findViewById(R.id.color_map_picker)));
    val.setVisibility(View.VISIBLE);
    bar.setVisibility(View.VISIBLE);
    bar.setOnSeekBarChangeListener(this);
    presenter = new com.iamtechknow.terraview.colormaps.ColorMapPresenterImpl();
    presenter.attachView(this);
    presenter.parseColorMap(id);
}