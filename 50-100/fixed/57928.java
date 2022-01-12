@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    if ((android.support.v4.view.MotionEventCompat.getActionMasked(event)) == (android.view.MotionEvent.ACTION_DOWN)) {
        ((com.ds.avareplus.PlanActivity) (mContext)).newDestination(mDestinationList.get(i));
        selected = (holder.getAdapterPosition()) + 1;
        updateList(mDestinationList);
    }
    return false;
}