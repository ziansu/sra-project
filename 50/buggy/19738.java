@java.lang.Override
public final void onFailure(retrofit2.Call<T> call, java.lang.Throwable t) {
    if ((view) != null) {
        view.get().hideProgress();
        view.get().showErrorDialog();
    }
}