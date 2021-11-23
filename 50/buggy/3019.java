@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.hui.zxing.scanner.WeApplication.mContext = this.getApplicationContext();
    java.lang.System.out.println("call WeApplication");
}