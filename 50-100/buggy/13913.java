@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.observadoresUsuario = new java.util.Vector<>();
    if ((((studios.thinkup.com.apprunning.model.RunningApplication) (this.getApplication())).getUsuario()) == null) {
        android.content.Intent intent = new android.content.Intent(this, studios.thinkup.com.apprunning.MainActivity.class);
        this.startActivity(intent);
        this.finish();
    }
    startUp(savedInstanceState);
}