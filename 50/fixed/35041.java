@java.lang.Override
public void onAttach(android.content.Context context) {
    dagger.android.support.AndroidSupportInjection.inject(this);
    super.onAttach(context);
}