@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getArguments()) != null) {
        mBaseURI = getArguments().getString(com.ustadmobile.port.android.view.ContainerPageFragment.ARG_PAGE_BASE_URI);
        mHref = getArguments().getString(com.ustadmobile.port.android.view.ContainerPageFragment.ARG_PAGE_HREF);
        mQuery = getArguments().getString(com.ustadmobile.port.android.view.ContainerPageFragment.ARG_PAGE_QUERY);
        pageSpineIndex = getArguments().getInt(com.ustadmobile.port.android.view.ContainerPageFragment.ARG_PAGE_INDEX);
    }
    this.autoplayRunJavascript = ((com.ustadmobile.port.android.view.ContainerActivity) (getActivity())).getAutoplayRunJavascript();
}