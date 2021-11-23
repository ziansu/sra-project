public static com.ustadmobile.port.android.view.ContainerPageFragment newInstance(java.lang.String baseURI, java.lang.String href, java.lang.String query, int pageSpineIndex) {
    com.ustadmobile.port.android.view.ContainerPageFragment fragment = new com.ustadmobile.port.android.view.ContainerPageFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putString(com.ustadmobile.port.android.view.ContainerPageFragment.ARG_PAGE_BASE_URI, baseURI);
    args.putString(com.ustadmobile.port.android.view.ContainerPageFragment.ARG_PAGE_HREF, href);
    args.putString(com.ustadmobile.port.android.view.ContainerPageFragment.ARG_PAGE_QUERY, query);
    args.putInt(com.ustadmobile.port.android.view.ContainerPageFragment.ARG_PAGE_INDEX, pageSpineIndex);
    fragment.setArguments(args);
    return fragment;
}