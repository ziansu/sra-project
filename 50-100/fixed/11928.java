public boolean groupRetriever() {
    view.setText("Group Members\n");
    try (java.io.FileInputStream file = openFileInput(("CMG" + (groupName)))) {
        java.util.Scanner in = new java.util.Scanner(file);
        while (in.hasNextLine()) {
            userAdded.add(in.nextLine());
            schedAdded.add(in.nextLine());
        } 
    } catch (java.lang.Exception e) {
        return false;
    }
    return true;
}