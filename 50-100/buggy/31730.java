protected Presenter createPresenter() {
    Presenter presenter = null;
    try {
        java.lang.reflect.Constructor<Presenter> constructor = presenterClass.getConstructor(getAppContext().getClass());
        presenter = constructor.newInstance(this);
    } catch (java.lang.Exception e) {
        android.util.Log.e("activity-presenter", e.getMessage());
    }
    return presenter;
}