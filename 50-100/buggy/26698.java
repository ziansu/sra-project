@java.lang.Override
public void run() {
    if (((badge) != null) && (!(badge.isDisabled()))) {
        animator.setCurrentPlayTime(((int) ((animator.getDuration()) - 1)));
        updateBadgePosition();
        badge.show();
    }
}