@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    mView.animate().translationX(0).alpha(1).setDuration(mAnimationTime).setListener(null);
    mDeleted = false;
    mDownX = 0;
    mDownY = 0;
    if ((mVelocityTracker) != null)
        mVelocityTracker.recycle();
    
    mVelocityTracker = null;
    dialog.dismiss();
}