@lombok.NonNull
@java.lang.Override
public android.view.View newView(@lombok.NonNull
android.view.ViewGroup parent, @lombok.NonNull
com.nextfaze.poweradapters.ViewType viewType) {
    return adapterForViewType(viewType).newView(parent, viewType);
}