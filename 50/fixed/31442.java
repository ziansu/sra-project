@java.lang.Override
public void getMessageList(int page) {
    mRxDoHttpClient.getMessageList(page).map(BaseResponse::getData).subscribeOn(io.reactivex.schedulers.Schedulers.io()).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(mView::showMessageList);
}