private void initializeDependencyInjection() {
    mainModule = new com.devfestgrx.talks.global.di.MainModule(this);
    component.inject(this);
}