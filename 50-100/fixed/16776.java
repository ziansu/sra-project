public void setCircleViewValue(float value) {
    if (value != 0) {
        mAutoplayState = com.harlie.radiotheater.radiomysterytheater.BaseActivity.AutoplayState.PLAYING;
        com.harlie.radiotheater.radiomysterytheater.data_helper.LoadingAsyncTask.mLoadingNow = false;
        if ((getCircleView()) != null) {
            getCircleView().setValue(value);
            if (value == (getCircleView().getMaxValue())) {
                hideCircleView();
            }
        }
    }
}