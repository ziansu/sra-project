@java.lang.Override
public void run() {
    if (((!(isActive)) && ((badge) != null)) && (!(badge.isDisabled()))) {
        animator.setCurrentPlayTime(animator.getDuration());
        updateBadgePosition();
        badge.show();
    }
}