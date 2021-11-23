@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    ivan.slavka.utils.LoggingUtils.addIgnoreClass(ivan.slavka.beans.WonderBean.class);
    this.setContentView(new ivan.slavka.StartGameView(this, this));
}