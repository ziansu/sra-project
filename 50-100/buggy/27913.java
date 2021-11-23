public void addRunconfiguration(javafx.util.Pair<de.prob2.ui.project.Machine, de.prob2.ui.project.Preference> runconfiguration) {
    java.util.List<de.prob2.ui.project.Runconfiguration> runconfigs = this.getRunconfigurations();
    runconfigs.add(new de.prob2.ui.project.Runconfiguration(runconfiguration.getKey().getName(), runconfiguration.getValue().getName()));
    this.set(new de.prob2.ui.project.Project(this.getName(), this.getDescription(), this.getMachines(), this.getPreferences(), runconfigs, this.getLocation()));
}