public boolean isSearchSupported() {
    if ((mFragment) instanceof com.door43.translationstudio.newui.translate.ViewModeFragment) {
        return ((com.door43.translationstudio.newui.translate.ViewModeFragment) (mFragment)).isSearchSupported();
    }
    return false;
}