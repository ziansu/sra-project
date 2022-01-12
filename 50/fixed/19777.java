@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked)
        cb_nveg.setChecked(false);
    else
        if (!(cb_nveg.isChecked()))
            cb_veg.setChecked(true);
        
    
}