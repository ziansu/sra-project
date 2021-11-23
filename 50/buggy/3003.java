public void merge() throws java.io.IOException {
    new org.kohsuke.github.Requester(root).method("DELETE").to(getApiRoute());
}