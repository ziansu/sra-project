@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked)
        cb_veg.setChecked(false);
    else
        if (!(cb_nveg.isChecked()))
            cb_nveg.setChecked(true);
        
    
}