public java.util.ArrayList<main.java.logic.Task> display() throws java.lang.Exception {
    java.util.ArrayList<main.java.logic.Task> result = temp.displayTemp();
    for (main.java.logic.Task abc : result) {
        abc.setShowToUserDelete(false);
    }
    return result;
}