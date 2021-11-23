public void applyEffect(com.framgia.photoalbum.effect.EffectFilter effect) {
    com.framgia.photoalbum.asynctask.EffectApplyAsyncTask mEffectApplyTask = new com.framgia.photoalbum.asynctask.EffectApplyAsyncTask(mEditBitmap, effect, mProcessDialog, this);
    mEffectApplyTask.execute();
}