public org.pi.litepost.html.Input csrfToken() {
    return ((org.pi.litepost.html.Input) (new org.pi.litepost.html.Input("hidden", this).class_("csrf-token"))).name("csrf_token").value(sessionManager.csrfToken());
}