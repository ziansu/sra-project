@java.lang.Override
public void onClick(android.view.View v) {
    nl.mprog.glimp.work_out.Workout[] plannerWorkouts = new nl.mprog.glimp.work_out.Workout[plannerArrayList.size()];
    plannerWorkouts = plannerArrayList.toArray(plannerWorkouts);
    android.content.Intent intent = new android.content.Intent(getActivity(), nl.mprog.glimp.work_out.Activities.EditPlannerActivity.class);
    intent.putExtra("planner", plannerWorkouts);
    startActivity(intent);
}