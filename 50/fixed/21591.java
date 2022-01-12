@java.lang.Override
void initView() {
    if ((provideContentRes()) == (R.layout.shock_activity_main_list)) {
        configView();
        super.initView();
        return ;
    }
    configView();
}