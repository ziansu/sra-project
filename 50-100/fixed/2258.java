public android.view.View getRbmView() {
    android.view.LayoutInflater li = ((android.view.LayoutInflater) (mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE)));
    if (mActivity.mIsDocked) {
        if (mActivity.mApkRun) {
            mChangeDimension = com.android.systemui.statusbar.policy.ActivityKeyView.DIALOG_OFFSET_DIMENSIONS;
            return buildRbmDockedRun(li);
        }else {
            mChangeDimension = 0;
            return buildRbmDocked(li);
        }
    }else {
        mChangeDimension = com.android.systemui.statusbar.policy.ActivityKeyView.DIALOG_OFFSET_DIMENSIONS;
        return buildRbmRun(li);
    }
}