public void setMessage(java.lang.String message, boolean flag) {
    if (flag == true) {
        this.message = util.MessageUtil.encodeMessage(message);
        this.encodeList = util.MessageUtil.getEncodeList();
        this.isEncode = true;
    }else {
        this.message = message;
    }
    this.originalMessage = this.message;
}