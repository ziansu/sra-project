@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
        android.util.Log.v("prachi", "onCheckedChanged FundDetails");
        DivasbleFundOption();
    }else {
        android.util.Log.v("prachi", "Else onCheckedChanged FundDetails");
        EnableFundOption();
    }
}