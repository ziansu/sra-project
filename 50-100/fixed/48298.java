public domain.Folder addMessage(domain.Folder f, domain.Message m) {
    org.springframework.util.Assert.notNull(f);
    org.springframework.util.Assert.notNull(m);
    if (!(f.getMessages().contains(m))) {
        f.addMessage(m);
        f = this.save(f);
    }
    return f;
}