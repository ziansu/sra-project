@java.lang.Override
public void onTaskSelected(me.geniusburger.turntracker.model.Task task, boolean autoTurn) {
    mCurrentTask = task;
    mTurnFragment = me.geniusburger.turntracker.TurnFragment.newInstance(task.id, task.name, autoTurn);
    getFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).replace(R.id.fragment_container, me.geniusburger.turntracker.TurnFragment.newInstance(task.id, task.name, autoTurn), me.geniusburger.turntracker.MainActivity.FRAGMENT_TURNS).addToBackStack(null).commit();
}