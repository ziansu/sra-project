@java.lang.Override
public void onDataEvent(com.jamieadkins.gwent.data.interactor.RxDatabaseEvent<? extends com.jamieadkins.commonutils.ui.RecyclerViewItem> data) {
    onDeckLoaded(((com.jamieadkins.gwent.data.Deck) (data.getValue())));
}