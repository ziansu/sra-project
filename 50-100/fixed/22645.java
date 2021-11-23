@java.lang.Override
public void run() {
    try {
        results = dataProvider.findEstablishments(query);
        appStateObservableProperty.setValue(AppState.loaded);
    } catch (java.io.IOException ioe) {
        appStateObservableProperty.setValue(AppState.connectionError);
    } catch (java.lang.Exception e) {
        appStateObservableProperty.setValue(AppState.error);
    }
    isBusy = false;
}