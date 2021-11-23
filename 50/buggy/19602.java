public void addMachine(java.io.File machine) {
    java.lang.String[] name = machine.getName().split("\\.");
    machines.add(new de.prob2.ui.project.Machine(name[0], "", machine));
}