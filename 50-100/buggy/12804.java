private void reloadCoategories() {
    java.lang.System.out.println("start Runnable...");
    threadPool.execute(new gui.RunnableParameter<java.lang.Integer>(trvCategory.getSelectionModel().getSelectedItem().getValue().getId()) {
        @java.lang.Override
        public void run() {
            superController.setSelectedCategory(parameter, true);
        }
    });
    java.lang.System.out.println("Runnable started.");
}