@butterknife.OnClick(value = R.id.partySizeNumber)
public void imageClick(android.view.View v) {
    int count = java.lang.Integer.parseInt(v.getTag().toString());
    if (count <= 1) {
        count = 1;
    }
    ((com.eaterapp.hungerpass.DealDetails) (mActivity)).callCheckInWebservice(java.lang.Integer.toString(count), v.getTag().toString());
}