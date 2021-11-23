public static amai.org.conventions.events.activities.ProgrammeDayFragment newInstance(java.util.Calendar date, int delayScrolling, java.util.List<amai.org.conventions.model.EventType> eventTypesFilter) {
    amai.org.conventions.events.activities.ProgrammeDayFragment fragment = new amai.org.conventions.events.activities.ProgrammeDayFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putLong(amai.org.conventions.events.activities.ProgrammeDayFragment.ARGS_DATE, date.getTimeInMillis());
    args.putInt(amai.org.conventions.events.activities.ProgrammeDayFragment.ARGS_DELAY_SCROLLING, delayScrolling);
    args.putSerializable(amai.org.conventions.events.activities.ProgrammeDayFragment.ARGS_EVENT_TYPES_FILTER, new java.util.ArrayList(eventTypesFilter));
    fragment.setArguments(args);
    return fragment;
}