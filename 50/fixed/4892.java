public static void showLoading(@android.support.annotation.NonNull
android.view.View loadingView, @android.support.annotation.NonNull
android.view.View errorView) {
    errorView.setVisibility(View.GONE);
    loadingView.setVisibility(View.VISIBLE);
}