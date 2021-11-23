@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return com.example.arthome.newexchangeworld.ItemPage.ItemFragment.newInstance();
        case 1 :
            return twoFragment.newInstance("1", "2");
        case 2 :
            return oneFragment.newInstance("1", "2");
        case 3 :
            return twoFragment.newInstance("1", "2");
        case 4 :
            return oneFragment.newInstance("1", "2");
        default :
            return null;
    }
}