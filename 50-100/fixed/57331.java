@java.lang.Override
public android.support.v4.app.Fragment getItem(int pos) {
    switch (pos) {
        case 0 :
            return com.twild.gastracker.FragmentFillupInfo.newInstance(currentCarPosition);
        case 1 :
            return com.twild.gastracker.SecondFragment.newInstance(currentCarPosition);
        case 2 :
            return com.twild.gastracker.ThirdFragment.newInstance("ThirdFragment, Instance 1");
        default :
            return com.twild.gastracker.ThirdFragment.newInstance("ThirdFragment, Default");
    }
}