@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot _dataSnapshot) {
    this.checkViewAttached();
    try {
        if (_dataSnapshot.exists()) {
            android.util.Log.d(com.cremy.shared.ui.presenter.BucketPresenter.TAG, _dataSnapshot.toString());
            this.model = _dataSnapshot.getValue(com.cremy.shared.data.model.Bucket.class);
            this.showBucket();
        }
    } catch (java.lang.ClassCastException e) {
        e.printStackTrace();
        this.view.showError();
    }
}