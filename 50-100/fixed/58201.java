@java.lang.Override
protected void onPostExecute(neilw4.omin.db.Message.Security security) {
    if (security == (Message.Security.UNVERIFIED)) {
        msg.delete();
        if ((callback) != null) {
            callback.onFail();
        }
    }else {
        msg.security = security;
        msg.save();
        if ((callback) != null) {
            callback.onSuccess();
        }
    }
}