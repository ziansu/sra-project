@java.lang.Override
public void delete(int position) {
    mGoals.remove(position);
    mAdapter.notify(AnimationType.REMOVE, position);
}