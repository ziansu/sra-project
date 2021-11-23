public static void main(java.lang.String[] args) {
    Controller.MainController controller = new Controller.MainController(new View.ConsoleView(), new Model.WebDownloader());
    controller.run();
}