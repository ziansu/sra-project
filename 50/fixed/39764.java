@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setHasOptionsMenu(false);
    mSymbol = getArguments().getString(Constants.SYMBOL_BUNDLE_KEY).toUpperCase();
}