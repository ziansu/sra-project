public static void main(final java.lang.String[] args) {
    final controller.ControllerFacade controller = new controller.ControllerFacade(new view.ViewFacade(), new model.ModelFacade());
    java.lang.System.out.println("test");
    try {
        controller.start();
    } catch (final java.sql.SQLException exception) {
        exception.printStackTrace();
    }
    final model.dao.ExampleDAO connection = new model.dao.ExampleDAO();
    try {
        connection.getMap(1);
    } catch (final java.sql.SQLException exception) {
        exception.getMessage();
    }
}