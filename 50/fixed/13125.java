@java.lang.Override
public void onSuccess(@io.reactivex.annotations.NonNull
java.util.List<com.takescoop.americanwhitewaterandroid.model.ReachSearchResult> reachSearchResults) {
    progressWheel.setVisibility(com.takescoop.americanwhitewaterandroid.view.GONE);
    setReachSearchResults(reachSearchResults);
}