protected void initializeAreaView() {
    getViewEngine().clear();
    getViewEngine().getManager().popView();
    getViewEngine().registerView(new com.wecanteven.AreaView.AreaView(getMap(), getLevelFactory()));
    getController().setPlayState();
}