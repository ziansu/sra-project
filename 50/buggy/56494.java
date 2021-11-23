@java.lang.Override
public ch.unibe.scg.zeeguuu.Search_Fragments.FragmentSearch getFragmentSearch() {
    fragmentSearch = ((ch.unibe.scg.zeeguuu.Search_Fragments.FragmentSearch) (fragmentManager.findFragmentById(ch.unibe.scg.zeeguuu.Core.ZeeguuActivity.ITEMIDSEARCH)));
    if ((fragmentSearch) == null)
        fragmentSearch = new ch.unibe.scg.zeeguuu.Search_Fragments.FragmentSearch();
    
    return fragmentSearch;
}