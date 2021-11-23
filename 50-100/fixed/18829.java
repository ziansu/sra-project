public static void main(java.lang.String[] args) {
    project.Controller controller = new project.ControllerFactory().createControllerAndLoadDatabase();
    project.CommandlineUI ui = new project.CommandlineUI(controller);
    java.lang.System.out.println("We are glad to see you in our Final Project Group 9 realization!");
    try {
        ui.showMenu();
    } catch (java.io.IOException e) {
        java.lang.System.out.println("There was a problem reading input from the user");
    }
}