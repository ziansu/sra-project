@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mContext = this;
    setContentView(R.layout.activity_home);
    com.facebook.drawee.backends.pipeline.Fresco.initialize(this);
    com.umeng.onlineconfig.OnlineConfigAgent.getInstance().updateOnlineConfig(this);
    initView();
    com.xiaoningmeng.player.PlayerManager.getInstance().register(this);
    de.greenrobot.event.EventBus.getDefault().register(this);
}