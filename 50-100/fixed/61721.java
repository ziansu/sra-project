public static com.codeest.geeknews.di.component.AppComponent getAppComponent() {
    if ((com.codeest.geeknews.app.App.appComponent) == null) {
        com.codeest.geeknews.app.App.appComponent = com.codeest.geeknews.di.component.DaggerAppComponent.builder().appModule(new com.codeest.geeknews.di.module.AppModule(com.codeest.geeknews.app.App.instance)).httpModule(new com.codeest.geeknews.di.module.HttpModule()).build();
    }
    return com.codeest.geeknews.app.App.appComponent;
}