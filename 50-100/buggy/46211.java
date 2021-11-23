private void modifyConsumer() {
    if (!(verifyData())) {
        return ;
    }
    if ((mConsumerDao.update(mConsumerDetail)) > 0) {
        com.classic.core.utils.ToastUtil.showToast(mAppContext, R.string.modify_consumer_success);
        notifyDataSetChanged();
        finish();
    }else {
        com.classic.core.utils.ToastUtil.showToast(mAppContext, R.string.modify_consumer_fail);
    }
}