@java.lang.Override
public void onClick(android.view.View view) {
    boolean checked = ((android.widget.RadioButton) (view)).isChecked();
    switch (view.getId()) {
        case R.id.wsgh_yes_rb :
            if (checked)
                wsghSpinnerRl.setVisibility(View.GONE);
            
            break;
        case R.id.wsgh_someoneelse_rb :
            if (checked)
                wsghSpinnerRl.setVisibility(View.VISIBLE);
            
            break;
    }
}