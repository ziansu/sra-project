private boolean deviceHeaderFragmentExists(java.lang.String tag) {
    tag = (com.beatboxers.MainActivity.LayoutManager.HEADER_FRAGMENT_TAG_PREFIX) + tag;
    for (com.beatboxers.fragments.FragmentDeviceHeader fragmentDeviceHeader : mmDeviceHeaderFragments) {
        if (tag.equals(fragmentDeviceHeader.getTag())) {
            return true;
        }
    }
    return false;
}