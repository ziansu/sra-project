public static void init(com.alex.code.foundation.App app) {
    com.alex.code.foundation.di.component.DaggerAppComponent.builder().create(app).inject(app);
}