public void addPreference(de.prob2.ui.project.Preference preference) {
    java.util.List<de.prob2.ui.project.Preference> preferencesList = this.getPreferences();
    preferencesList.add(preference);
    this.set(new de.prob2.ui.project.Project(this.getName(), this.getDescription(), this.getMachines(), preferencesList, this.getRunconfigurations(), this.getLocation()));
}