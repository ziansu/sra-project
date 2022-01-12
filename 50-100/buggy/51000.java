@java.lang.Override
public void onNext(@io.reactivex.annotations.NonNull
java.lang.Object o) {
    java.io.File file = ((java.io.File) (o));
    if (file == null) {
        com.andreabardella.aifaservicesconsumer.view.DismissOnlyDialog dialog = com.andreabardella.aifaservicesconsumer.view.DismissOnlyDialog.newInstance(requestId, "Error", "Oops...file is null", "dismiss");
        dialog.show(getFragmentManager(), ("ERROR_DIALOG_" + requestId));
        return ;
    }
    java.lang.String path = file.getPath();
    timber.log.Timber.d("onNext, url: %s, requestId: %d, path: %s", url, requestId, path);
    drugItem.setRcpPath(path);
}