public java.lang.String getRunTitle(android.content.Context context) {
    if (android.text.TextUtils.isEmpty(mRun.getTitle())) {
        if ((mRun.getRunIndex()) != (-1)) {
            return context.getString(R.string.run_label, ((mRun.getRunIndex()) + 1));
        }else {
            return context.getString(R.string.run_label, "");
        }
    }else {
        return mRun.getTitle();
    }
}