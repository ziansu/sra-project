@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            se.standersson.icingalert.ProblemFragment troubleFragment = se.standersson.icingalert.ProblemFragment.newInstance(position, hostsDownNr);
            fragmentArray[0] = troubleFragment;
            return troubleFragment;
        case 1 :
            se.standersson.icingalert.ProblemFragment allFragment = se.standersson.icingalert.ProblemFragment.newInstance(position, se.standersson.icingalert.MainActivity.hosts.size());
            fragmentArray[1] = allFragment;
            return allFragment;
        default :
            return null;
    }
}