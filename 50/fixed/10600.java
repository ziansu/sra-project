@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    return amai.org.conventions.events.activities.ProgrammeDayFragment.newInstance(getDate(position), delayScrolling);
}