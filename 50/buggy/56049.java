@java.lang.Override
public void onChanged() {
    super.onChanged();
    if ((getDropDownAnchor()) == 0)
        return ;
    
    dropDownTopElement = getAdapter().getItem(0);
}