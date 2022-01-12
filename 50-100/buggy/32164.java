@android.support.annotation.Nullable
@java.lang.Override
public final android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.View mView = this.onCreateViewInternal(inflater, container, savedInstanceState);
    lin.core.Views.process(this);
    lin.core.mvvm.Utils.processViewModel(this);
    this.onCreateView();
    return mView;
}