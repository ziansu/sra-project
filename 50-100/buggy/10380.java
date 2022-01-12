@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean b) {
    switch (compoundButton.getId()) {
        case R.id.cod_client_fragment :
            break;
        case R.id.qr_client_fragment :
            if (b)
                _qrAmountll.setVisibility(View.VISIBLE);
            else
                _qrAmountll.setVisibility(View.GONE);
            
            break;
        case R.id.bt_client_fragment :
            if (b)
                _btAmountll.setVisibility(View.VISIBLE);
            else
                _btAmountll.setVisibility(View.VISIBLE);
            
            break;
    }
}