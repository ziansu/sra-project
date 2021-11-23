@java.lang.Override
protected void onPostExecute(neilw4.omin.db.Message.Security security) {
    if (security == (Message.Security.UNVERIFIED)) {
        msg.delete();
        callback.onFail();
    }else {
        msg.security = security;
        msg.save();
        callback.onSuccess();
    }
}