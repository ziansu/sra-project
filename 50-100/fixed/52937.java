@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getArguments()) != null) {
        mHref = getArguments().getString(com.ustadmobile.port.android.view.ContainerPageFragment.ARG_PAGE_HREF);
        pageSpineIndex = getArguments().getInt(com.ustadmobile.port.android.view.ContainerPageFragment.ARG_PAGE_INDEX);
    }
    this.autoplayRunJavascript = ((com.ustadmobile.port.android.view.ContainerActivity) (getActivity())).getAutoplayRunJavascript();
}