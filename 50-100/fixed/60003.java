@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    android.support.v4.app.Fragment tab;
    if (position == 0) {
        tab = new com.aysoreyp.aysor.fragments.CommiteesFragment();
    }else
        if (position == 1) {
            tab = new com.aysoreyp.aysor.fragments.ScheduleFragment();
        }else
            if (position == 2) {
                tab = new com.aysoreyp.aysor.fragments.MediaFragment();
            }else {
                tab = new com.aysoreyp.aysor.fragments.AboutFragment();
            }
        
    
    return tab;
}