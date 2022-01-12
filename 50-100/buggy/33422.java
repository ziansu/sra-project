public void setMessage(java.lang.String message, int id) {
    this.Message = message;
    this.Id = (id == 0) ? message.hashCode() : id;
    if (!(PlayFabConst.hideLogs))
        android.util.Log.i(PlayFabConst.LOG_TAG, ((("Setting message and id, Message: " + (this.Message)) + ", Id: ") + (this.Id)));
    
}