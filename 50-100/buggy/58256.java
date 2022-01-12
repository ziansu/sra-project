private static void update() {
    com.github.kamys.managerProduct.data.managers.Manager<com.github.kamys.managerProduct.logic.layout.Layout> manager = new com.github.kamys.managerProduct.data.managers.ManagerLayout();
    com.github.kamys.managerProduct.logic.layout.Layout layoutForFind = new com.github.kamys.managerProduct.logic.layout.Layout();
    layoutForFind.setName("Молоко");
    com.github.kamys.managerProduct.data.managers.criteria.Parameters oldParameters = com.github.kamys.managerProduct.data.managers.criteria.ParametersFactory.createParameter(layoutForFind);
    oldParameters.setUseForSelect("name", true);
    com.github.kamys.managerProduct.data.managers.criteria.Parameters newParameters = com.github.kamys.managerProduct.data.managers.criteria.ParametersFactory.createParameter(new com.github.kamys.managerProduct.logic.layout.Layout("Хлеб"));
    newParameters.setUseForUpdate("name", true);
    manager.update(oldParameters, newParameters);
    manager.close();
}