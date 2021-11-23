@java.lang.Override
protected at.sw2017xp3.regionalo.model.Product doInBackground(java.lang.Integer... params) {
    try {
        return at.sw2017xp3.regionalo.model.Core.getInstance().getProducts().getProduct(params[0]);
    } catch (java.lang.Exception e) {
        return null;
    }
}