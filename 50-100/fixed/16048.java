@java.lang.Override
public void setLayerId(java.lang.String id) {
    val = ((android.widget.TextView) (getRootView().findViewById(R.id.color_map_val)));
    val.setVisibility(View.VISIBLE);
    presenter = new com.iamtechknow.terraview.colormaps.ColorMapPresenterImpl();
    presenter.attachView(this);
    presenter.parseColorMap(id);
}