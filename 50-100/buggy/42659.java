@java.lang.Override
public void onError(java.lang.Throwable e) {
    retrofit2.adapter.rxjava.HttpException httpErr = ((retrofit2.adapter.rxjava.HttpException) (e));
    if ((httpErr.code()) == 403) {
        android.content.Intent intent = new android.content.Intent(self.getContext(), com.joncatanio.billme.LoginActivity.class);
        self.startActivity(intent);
    }else {
        android.util.Log.e("BillObserver", e.getMessage());
    }
}