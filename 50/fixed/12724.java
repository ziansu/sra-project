@java.lang.Override
public void onLivingUpdate() {
    super.onLivingUpdate();
    if ((currentUseCooldown) > 0) {
        setCurrentUseCooldown(((currentUseCooldown) - 1));
    }
}