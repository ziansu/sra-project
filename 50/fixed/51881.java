private boolean isMultiScmAvailable() {
    final jenkins.model.Jenkins jenkins = jenkins.model.Jenkins.getInstance();
    return (jenkins.getPlugin("multiple-scms")) != null;
}