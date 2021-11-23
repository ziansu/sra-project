@java.lang.Override
public void onClick(android.view.View v) {
    super.onClick(v);
    switch (v.getId()) {
        case R.id.iv_my_task :
            break;
        case R.id.iv_news :
            changeFragment(R.id.fl_home_content, new com.softtanck.framework.fragment.NewsFragment());
            break;
        case R.id.iv_study_history :
            break;
    }
}