@java.lang.Override
public boolean onReposSelected() {
    clearFragments();
    setFragment(com.alorma.github.ui.fragment.repos.GeneralReposFragment.newInstance(), false);
    return true;
}