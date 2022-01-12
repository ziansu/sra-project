@java.lang.Override
public void onUpdate(com.wylder.shuttlewidget.ScheduleConstraint[] newConstraints) {
    constraints = newConstraints;
    if ((newConstraints.length) == 0) {
        flagEmptyList = true;
        constraints = new com.wylder.shuttlewidget.ScheduleConstraint[]{ null };
    }
    com.wylder.shuttlewidget.ConstraintListAdapter adapter = new com.wylder.shuttlewidget.ConstraintListAdapter(getActivity(), constraints);
    setListAdapter(adapter);
}