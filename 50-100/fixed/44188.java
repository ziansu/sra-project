@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    component = com.lazysoul.kotlinwithandroid.injection.components.DaggerActivityComponent.builder().applicationComponent(getApplicationComponet()).activityModule(new com.lazysoul.kotlinwithandroid.injection.module.ActivityModule(this)).build();
    inject();
    initPresenter();
}