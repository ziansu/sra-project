@java.lang.Override
public void onComplete(me.lolevsky.nasaplanetary.model.MainScreenModule model) {
    if (model != null) {
        mainViewAdapter.setList(model.getEntityList());
    }
}