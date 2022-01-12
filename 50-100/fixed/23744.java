@java.lang.Override
public void run() {
    java.lang.String currentWeek = currentWeekEditText.getText().toString();
    if ((currentWeek.length()) == 0) {
        android.os.Message msg = new android.os.Message();
        msg.obj = "请输入本周是第几周!!";
        makeToast.sendMessage(msg);
    }else {
        android.os.Message msg = new android.os.Message();
        msg.obj = "导入开始, 请稍等片刻...";
        makeToast.sendMessage(msg);
        stu.getCurrentWeek(java.lang.Integer.parseInt(currentWeek));
        stu.writeCalendar();
    }
}