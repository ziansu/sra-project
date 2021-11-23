@butterknife.OnClick(value = { R.id.box1 , R.id.box2 , R.id.box3 , R.id.box4 })
public void onBoxClick(android.view.View view) {
    java.lang.Integer index = java.lang.Integer.valueOf(((java.lang.String) (view.getTag())));
    this.chartComponent.setVisible(index, ((android.support.v7.widget.AppCompatCheckBox) (view)).isChecked());
}