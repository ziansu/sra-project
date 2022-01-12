protected void initializeAreaView() {
    getViewEngine().clear();
    getViewEngine().getManager().popView();
    viewEngine.registerView(new com.wecanteven.AreaView.AreaView(getMap(), getLevelFactory()));
    getViewEngine().registerView(new com.wecanteven.AreaView.AreaView(getMap(), getLevelFactory()));
    getController().setPlayState();
}