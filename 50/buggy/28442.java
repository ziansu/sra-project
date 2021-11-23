private boolean isUnlockMethodSecure(java.lang.String unlockMethod) {
    return !((com.android.settings.ChooseLockGeneric.ChooseLockGenericFragment.KEY_UNLOCK_SET_OFF.equals(unlockMethod)) || (com.android.settings.ChooseLockGeneric.ChooseLockGenericFragment.KEY_UNLOCK_SET_NONE.equals(unlockMethod)));
}