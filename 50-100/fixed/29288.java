public static amai.org.conventions.events.activities.ProgrammeDayFragment newInstance(java.util.Calendar date, int delayScrolling) {
    amai.org.conventions.events.activities.ProgrammeDayFragment fragment = new amai.org.conventions.events.activities.ProgrammeDayFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putLong(amai.org.conventions.events.activities.ProgrammeDayFragment.ARGS_DATE, date.getTimeInMillis());
    args.putInt(amai.org.conventions.events.activities.ProgrammeDayFragment.ARGS_DELAY_SCROLLING, delayScrolling);
    fragment.setArguments(args);
    return fragment;
}