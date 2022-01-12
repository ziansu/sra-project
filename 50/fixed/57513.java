@java.lang.Override
int getContentRes() {
    return (provideContentRes()) == (R.layout.shock_activity_main_list) ? R.layout.shock_activity_main_list : provideContentRes();
}