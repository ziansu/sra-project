public static void main(final java.lang.String[] args) {
    final model.Model model = new model.Model();
    final view.View view = new view.View(model);
    final controller.Controller controller = new controller.Controller(view, model);
    view.setController(controller);
    controller.control();
}