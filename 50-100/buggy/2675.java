@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_jxnugo_userinfo);
    initToolbar();
    loadUserInfo();
    initView();
    progressBar.setVisibility(View.VISIBLE);
    org.greenrobot.eventbus.EventBus.getDefault().register(this);
    cn.edu.jxnu.awesome_campus.database.dao.jxnugo.JxnuGoUserDAO dao = new cn.edu.jxnu.awesome_campus.database.dao.jxnugo.JxnuGoUserDAO();
    dao.loadFromNet();
}