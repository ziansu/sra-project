public com.amaze.filemanager.fragments.MainFragment getCurrentMainFragment() {
    if ((getTabFragment()) == null)
        return null;
    
    return ((com.amaze.filemanager.fragments.MainFragment) (getTabFragment().getTab()));
}