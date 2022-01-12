@java.lang.Override
public void onClick(android.view.View v) {
    textViewNumber.setText(com.bandwidth.androidreference.utils.NumberUtils.getPrettyPhoneNumber(((textViewNumber.getText()) + (v.getTag().toString()))));
    com.bandwidth.bwsip.BWTone.playDigit(v.getTag().toString());
    com.bandwidth.androidreference.CallService.dialDTMF(v.getTag().toString());
}