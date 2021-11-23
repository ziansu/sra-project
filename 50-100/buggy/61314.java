@java.lang.Override
public void run() {
    int initialHeight = eventsListView.getLayoutParams().height;
    int targetHeight = amai.org.conventions.events.holders.ConflictingEventsViewHolder.getListHeight(eventsListView.getResources(), adapter.getItemCount());
    android.animation.Animator animator = amai.org.conventions.events.holders.ConflictingEventsViewHolder.getHeightChangeAnimator(eventsListView, initialHeight, targetHeight);
    animator.setDuration(getMoveDuration()).start();
}