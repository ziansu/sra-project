@java.lang.Override
public void initView() {
    setOnLineLayout(cn.edu.jxnu.awesome_campus.support.utils.login.EducationLoginUtil.isLogin());
    courseTableModel.loadFromCache();
    tip.setText(InitApp.AppContext.getString(R.string.notify_no_course));
}