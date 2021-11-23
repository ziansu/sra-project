public edu.ksu.operatingsystems.javaos.storage.ProcessControlBlock getProcessByID(int ID) {
    for (int i = 0; i < (processArray.length); i++) {
        if ((processArray[i].getID()) == ID) {
            java.lang.System.out.println(("I found the program with ID: " + ID));
            return processArray[i];
        }
    }
    java.lang.System.out.println(("Failed to find process with ID: " + ID));
    return null;
}