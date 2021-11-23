private void addConsumer() {
    if (!(verifyData())) {
        return ;
    }
    if ((mConsumerDao.insert(mConsumerDetail)) > 0) {
        com.classic.core.utils.ToastUtil.showToast(mAppContext, R.string.add_consumer_success);
        notifyDataSetChanged();
        reset();
    }else {
        com.classic.core.utils.ToastUtil.showToast(mAppContext, R.string.add_consumer_fail);
    }
}