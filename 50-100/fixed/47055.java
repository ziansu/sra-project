@java.lang.Override
public android.support.v4.app.Fragment getItem(int i) {
    switch (i) {
        case 0 :
            return com.example.cookzyme.cookzyme.RefrigeratorSectionFragment.newInstance();
        case 1 :
            return new com.example.cookzyme.cookzyme.ref.EmptyActivity();
        case 2 :
            return com.example.cookzyme.cookzyme.HomeSectionFragment.newInstance();
        case 3 :
            return com.example.cookzyme.cookzyme.ProfileFragment.newInstance();
        case 4 :
            return new com.example.cookzyme.cookzyme.ref.EmptyActivity();
        default :
            return com.example.cookzyme.cookzyme.ProfileFragment.newInstance();
    }
}