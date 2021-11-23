@java.lang.Override
public void onClick(android.view.View v) {
    if ((editroomName) != null) {
        add();
    }else {
        android.widget.Toast.makeText(this, "請輸入房間名稱", Toast.LENGTH_SHORT).show();
    }
}