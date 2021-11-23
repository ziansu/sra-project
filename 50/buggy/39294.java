public <T> T content() {
    return (response()) == null ? null : response().content();
}