@java.lang.Override
protected void onCreate(final android.os.Bundle savedInstanceState) {
    this.setInfo(this);
    super.onCreate(savedInstanceState);
    com.asmodehn.wkcocos.testapp.AppActivity.nativeInitGPGS(this);
    com.asmodehn.wkcocos.testapp.AppActivity.nativeOnActivityCreated(this, savedInstanceState);
}