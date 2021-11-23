public java.util.List<org.jboss.tools.maven.reddeer.project.examples.wizard.ExampleRequirement> getRequirements() {
    org.jboss.reddeer.swt.api.Group reqGroup = new org.jboss.reddeer.swt.impl.group.DefaultGroup("Requirements");
    org.jboss.reddeer.swt.api.Table r = new org.jboss.reddeer.swt.impl.table.DefaultTable(reqGroup);
    java.util.List<org.jboss.tools.maven.reddeer.project.examples.wizard.ExampleRequirement> reqs = new java.util.ArrayList<org.jboss.tools.maven.reddeer.project.examples.wizard.ExampleRequirement>();
    for (int i = 0; i < (r.rowCount()); i++) {
        reqs.add(new org.jboss.tools.maven.reddeer.project.examples.wizard.ExampleRequirement(r, i));
    }
    return reqs;
}