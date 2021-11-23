private void reloadCoategories() {
    threadPool.execute(new gui.RunnableParameter<java.lang.Integer>(trvCategory.getSelectionModel().getSelectedItem().getValue().getId()) {
        @java.lang.Override
        public void run() {
            superController.setSelectedCategory(parameter, true);
        }
    });
}