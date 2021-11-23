private void initDependencyInjection() {
    component = com.wisdomlanna.www.dagger2_mvp_example.DaggerApplicationComponent.builder().androidModule(new com.wisdomlanna.www.dagger2_mvp_example.AndroidModule(this)).utilModule(new com.wisdomlanna.www.dagger2_mvp_example.UtilModule()).build();
    getComponent().inject(this);
}