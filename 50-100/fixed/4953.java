public void setPayload() {
    this.initializePayload(this.hintedPayloadList, MyURL.URL_HINTED_TASK);
    if ((this.automation) == (MyGame.AUTO_LOW)) {
        this.initializePayload(this.maybePayloadList, MyURL.URL_MAYBE_TASK_BAD);
        java.lang.System.out.println(MyURL.URL_MAYBE_TASK_BAD);
    }else {
        this.initializePayload(this.maybePayloadList, MyURL.URL_MAYBE_TASK_GOOD);
    }
    this.initializePayload(this.noHintPayloadList, MyURL.URL_NO_HINT_TASK);
}