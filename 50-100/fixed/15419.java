public void uiAddSection() {
    java.lang.System.out.print("Dati numele sectiei: ");
    java.lang.String name = scanner.nextLine();
    if (name.equals("")) {
        print("Nume invalid!");
        return ;
    }
    java.lang.System.out.print("Dati numarul de locuri al sectiei: ");
    int nrLoc = scanner.nextInt();
    scanner.nextLine();
    sectionController.add(new afterwind.lab1.entity.Section(sectionController.getNextId(), name, nrLoc));
}