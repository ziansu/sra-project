public void send(java.lang.String title, java.lang.String msg) {
    logger.info(("sending callback msg:" + title));
    try {
        org.apache.http.client.fluent.Request.Post(callbackUrl).bodyForm(org.apache.http.client.fluent.Form.form().add("msg", title).build(), Consts.UTF_8).execute();
    } catch (java.io.IOException e) {
        logger.error("Send callback msg failed", e);
    }
}