public void setCircleViewValue(float value) {
    if (value != 0) {
        mAutoplayState = com.harlie.radiotheater.radiomysterytheater.BaseActivity.AutoplayState.PLAYING;
        com.harlie.radiotheater.radiomysterytheater.data_helper.LoadingAsyncTask.mLoadingNow = false;
        if ((getCircleView()) != null) {
            getCircleView().setValue(value);
            com.harlie.radiotheater.radiomysterytheater.utils.LogHelper.w(com.harlie.radiotheater.radiomysterytheater.BaseActivity.TAG, ("setCircleViewValue: value=" + value));
            if (value == (getCircleView().getMaxValue())) {
                hideCircleView();
            }
        }
    }
}