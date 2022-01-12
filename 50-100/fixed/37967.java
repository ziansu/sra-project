@butterknife.OnClick(value = R.id.rl_filter_property_type)
public void selectPropertyType() {
    java.util.List<java.lang.String> arrType = searchFilter.getData().getPropertyType();
    if ((arrType.size()) > 0) {
        if (!(arrType.get(0).equals(getResources().getString(R.string.str_any))))
            arrType.add(0, getResources().getString(R.string.str_any));
        
    }
    showDialogAlert(((java.util.ArrayList<java.lang.String>) (arrType)), 1);
}