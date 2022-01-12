@java.lang.Override
public void onSuccess(java.util.List<net.dean.jraw.models.Contribution> contributions) {
    if (contributions.isEmpty()) {
        view.showNothingToShowSnackbar();
        view.hideContent();
    }else {
        view.showContent(contributions, reset);
    }
    if (reset) {
        view.scrollToTop();
        view.setLoadingIndicator(false);
    }
}