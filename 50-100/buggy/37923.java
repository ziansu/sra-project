@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    super.onCreateView(inflater, container, savedInstanceState);
    android.os.Bundle bundle = getArguments();
    mRow = bundle.getInt(com.visualstudio.m3l3m01t.myth.MainActivity.KEY_ROW);
    mCol = bundle.getInt(com.visualstudio.m3l3m01t.myth.MainActivity.KEY_COL);
    if ((mCol) < (com.visualstudio.m3l3m01t.myth.MainActivity.MyFragment.mLayouts.size())) {
        return inflater.inflate(com.visualstudio.m3l3m01t.myth.MainActivity.MyFragment.mLayouts.get(mCol).first, container);
    }
    return null;
}