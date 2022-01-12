@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    android.support.v4.app.Fragment fragment = null;
    switch (position) {
        case 0 :
            {
                fragment = new pl.chebad.bond.dam.tourguideapp.Fragments.CultureFragment();
                break;
            }
        case 1 :
            {
                fragment = new pl.chebad.bond.dam.tourguideapp.Fragments.FunFragment();
                break;
            }
        case 2 :
            {
                fragment = new pl.chebad.bond.dam.tourguideapp.Fragments.HealthActivitiesFragment();
                break;
            }
        case 3 :
            {
                fragment = new pl.chebad.bond.dam.tourguideapp.Fragments.RestaurantFragment();
                break;
            }
        case 4 :
            {
                fragment = new pl.chebad.bond.dam.tourguideapp.Fragments.EducationFragment();
                break;
            }
    }
    return fragment;
}