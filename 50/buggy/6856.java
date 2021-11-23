@java.lang.Override
public void onDestroy() {
    java.lang.System.out.println("我被销毁了！！");
    username = "";
    password = "";
    super.onDestroy();
}