@java.lang.Override
public void onClick(android.view.View v) {
    if (netConnect()) {
        if (et_keyword.getText().toString().equals("")) {
            showToast("请先输入歌曲名字", Toast.LENGTH_SHORT);
        }else {
            tv_show.setText("");
            new java.lang.Thread(networkTask).start();
        }
    }else {
        showToast("请先连接网络后再使用", Toast.LENGTH_SHORT);
    }
}