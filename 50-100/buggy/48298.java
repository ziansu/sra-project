public void addMessage(domain.Folder f, domain.Message m) {
    org.springframework.util.Assert.notNull(f);
    org.springframework.util.Assert.notNull(m);
    if (!(f.getMessages().contains(m))) {
        f.addMessage(m);
        this.save(f);
    }
}