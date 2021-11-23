@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mContext = this;
    com.facebook.drawee.backends.pipeline.Fresco.initialize(this);
    setContentView(R.layout.activity_home);
    com.umeng.onlineconfig.OnlineConfigAgent.getInstance().updateOnlineConfig(this);
    initView();
    com.xiaoningmeng.player.PlayerManager.getInstance().register(this);
    de.greenrobot.event.EventBus.getDefault().register(this);
}