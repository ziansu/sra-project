public void printModuleList() {
    for (int i = 0; i <= (modules.size()); i++) {
        com.forthyear.softwareeng3.studentregistration.Module printModule = modules.get(i);
        printModule.printDetails();
    }
}