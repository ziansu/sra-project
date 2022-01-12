private void createJournal(src.Server.User currentUser, src.Server.Patient patient) {
    if (currentUser.isDoctor()) {
        src.Server.Journal newJournal = new src.Server.Journal(patient);
        newJournal.addTreater(currentUser, currentUser);
        journals.put(currentUser.getID(), newJournal);
        try {
            save("journals");
        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}