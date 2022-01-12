private void initializeAppComponent(com.vpaliy.soundcloud.model.Token token) {
    if ((applicationComponent) == null) {
        applicationComponent = com.vpaliy.melophile.di.component.DaggerApplicationComponent.builder().applicationModule(new com.vpaliy.melophile.di.module.ApplicationModule(this)).dataModule(new com.vpaliy.melophile.di.module.DataModule()).networkModule(new com.vpaliy.melophile.di.module.NetworkModule(token)).mapperModule(new com.vpaliy.melophile.di.module.MapperModule()).interactorModule(new com.vpaliy.melophile.di.module.InteractorModule()).build();
        initializePlayerComponent();
    }
}