@butterknife.OnClick(value = R.id.btn_begin_check)
public void beginCheck() {
    mFailedTime = 0;
    mBeginDetect = true;
    beginCheckUI();
    java.lang.System.out.println(connect());
}