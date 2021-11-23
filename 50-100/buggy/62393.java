public void copyFrom(mindroid.os.Message otherMessage) {
    this.flags = 0;
    this.what = otherMessage.what;
    this.arg1 = otherMessage.arg1;
    this.arg2 = otherMessage.arg2;
    this.obj = otherMessage.obj;
    if ((otherMessage.data) != null) {
        this.data = ((mindroid.os.Bundle) (otherMessage.data.clone()));
    }else {
        this.data = null;
    }
}