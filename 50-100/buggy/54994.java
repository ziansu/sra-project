@java.lang.Override
public android.app.Fragment getItem(int position) {
    if ((fragments[position]) == null) {
        int diff = position - ((edu.mit.mitmobile2.events.adapters.CalendarWeekPagerAdapter.SIZE) / 2);
        edu.mit.mitmobile2.events.fragment.CalendarWeekFragment fragment = edu.mit.mitmobile2.events.fragment.CalendarWeekFragment.newInstance(startPoint, diff, this.positionInWeek);
        fragments[position] = fragment;
        return fragment;
    }else {
        return fragments[position];
    }
}