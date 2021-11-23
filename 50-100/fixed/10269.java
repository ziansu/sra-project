public void addMachine(de.prob2.ui.project.Machine machine) {
    java.util.List<de.prob2.ui.project.Machine> machinesList = this.getMachines();
    machinesList.add(machine);
    this.update(new de.prob2.ui.project.Project(this.getName(), this.getDescription(), machinesList, this.getPreferences(), this.getRunconfigurations(), this.getLocation()));
}