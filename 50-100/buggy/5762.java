@java.lang.Override
public Transaction.Result doTransaction(com.firebase.client.MutableData mutableData) {
    if ((mutableData.getValue(java.lang.Integer.class)) == null) {
        mutableData.setValue(100);
    }else {
        int health = mutableData.getValue(java.lang.Integer.class);
        health -= value;
        if (health > 0) {
            mutableData.setValue(((mutableData.getValue(java.lang.Integer.class)) - value));
        }else {
            mutableData.setValue(0);
        }
    }
    return com.firebase.client.Transaction.success(mutableData);
}