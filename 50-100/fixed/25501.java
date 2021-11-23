public static void main(java.lang.String[] args) {
    model.MyModel model = new model.MyModel();
    view.MyView ui = new view.MyView();
    presenter.Presenter p = new presenter.Presenter(model, ui);
    model.addObserver(p);
    ui.addObserver(p);
    ui.start();
}