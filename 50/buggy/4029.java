@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return com.teamlz.cheTajo.fragment.HomeListFragment.newIstance();
        case 1 :
            return com.teamlz.cheTajo.fragment.BlankFragment.newInstance(position);
        default :
            return null;
    }
}