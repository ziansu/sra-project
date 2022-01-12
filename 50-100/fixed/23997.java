@java.lang.Override
protected void onResumeFragments() {
    super.onResumeFragments();
    if (((currentStackTag) != null) && ((fragmentMap) != null)) {
        java.util.List<indi.yume.tools.fragmentmanager.BaseManagerFragment> list = fragmentMap.get(currentStackTag);
        if ((list != null) && (!(list.isEmpty())))
            list.get(((list.size()) - 1)).onShow();
        
    }
}