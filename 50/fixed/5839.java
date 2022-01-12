@butterknife.OnClick(value = R.id.break_time_ok)
public void onOkClicked() {
    hide();
    if ((callback) != null)
        callback.onOkClicked(times);
    
}