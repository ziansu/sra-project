@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if (position == 0) {
        com.rahmanbari.discountopia.fragments.FeaturedDealsFragment featuredDealsTab = new com.rahmanbari.discountopia.fragments.FeaturedDealsFragment();
        return featuredDealsTab;
    }else
        if (position == 1) {
            com.rahmanbari.discountopia.fragments.DepartmentsFragment departmentsTab = new com.rahmanbari.discountopia.fragments.DepartmentsFragment();
            return departmentsTab;
        }else
            if (position == 2) {
                com.rahmanbari.discountopia.fragments.BrandsFragment brandsTab = new com.rahmanbari.discountopia.fragments.BrandsFragment();
                return brandsTab;
            }else {
                com.rahmanbari.discountopia.fragments.MallsFragment mallsTab = new com.rahmanbari.discountopia.fragments.MallsFragment();
                return mallsTab;
            }
        
    
}