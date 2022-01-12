public static com.ustadmobile.port.android.view.ContainerPageFragment newInstance(java.lang.String href, int pageSpineIndex) {
    com.ustadmobile.port.android.view.ContainerPageFragment fragment = new com.ustadmobile.port.android.view.ContainerPageFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putString(com.ustadmobile.port.android.view.ContainerPageFragment.ARG_PAGE_HREF, href);
    args.putInt(com.ustadmobile.port.android.view.ContainerPageFragment.ARG_PAGE_INDEX, pageSpineIndex);
    fragment.setArguments(args);
    return fragment;
}