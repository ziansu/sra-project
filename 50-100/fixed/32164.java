@android.support.annotation.Nullable
@java.lang.Override
public final android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    mView = this.onCreateViewInternal(inflater, container, savedInstanceState);
    lin.core.Views.process(this, mView);
    lin.core.mvvm.Utils.processViewModel(this);
    this.onCreateView();
    return mView;
}