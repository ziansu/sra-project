@java.lang.Override
public Transaction.Result doTransaction(com.firebase.client.MutableData mutableData) {
    if ((mutableData.getValue(java.lang.Integer.class)) == null) {
        mutableData.setValue(0);
    }else {
        mutableData.setValue(((mutableData.getValue(java.lang.Integer.class)) + value));
    }
    return com.firebase.client.Transaction.success(mutableData);
}