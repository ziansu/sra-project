public static check.Model getTestModel() {
    check.Model model = new check.Model("v,c");
    model.addState(1, "v", "2");
    model.addState(2, "v", "1,4");
    model.addState(3, "c", "4");
    model.addState(4, "c", "3");
    model.setStartStates("1,2,3,4");
    model.initialize();
    return model;
}