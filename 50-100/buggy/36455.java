private void resetValueFields() {
    changeFadingTextViewValue(tv_Result_Download, getString(R.string.slash), 0);
    changeFadingTextViewValue(tv_Result_Upload, getString(R.string.slash), 0);
    changeFadingTextViewValue(tv_Result_Latency, getString(R.string.slash), 0);
    changeFadingTextViewValue(tv_Result_Packet_Loss, getString(R.string.slash), 0);
    changeFadingTextViewValue(tv_Result_Jitter, getString(R.string.slash), 0);
    changeFadingTextViewValue(tv_Result_DateDay, getString(R.string.slash), 0);
    changeFadingTextViewValue(tv_Result_DateTime, getString(R.string.slash), 0);
}