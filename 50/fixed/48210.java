@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.os.Bundle args = getArguments();
    if (args != null) {
        mPageIndex = args.getInt(me.li2.android.inteliment_demo.ui.SimplePageFragment.ARG_KEY_PAGE_INDEX);
    }
}