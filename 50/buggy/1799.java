@butterknife.OnClick(value = R.id.btn_End)
void onBtnEndClick() {
    android.widget.Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
    edu.aku.hassannaqvi.codi.core.AppMain.endActivity(this, this);
}