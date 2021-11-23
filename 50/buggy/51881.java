private boolean isMultiScmAvailable() {
    final jenkins.model.Jenkins jenkins = jenkins.model.Jenkins.getInstance();
    if (jenkins == null) {
        return false;
    }
    return (jenkins.getPlugin("multiple-scms")) != null;
}