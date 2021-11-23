private void update(int delta) {
    for (main.InputInterface input : main.InputInterface.getInterfaces()) {
        input.update(delta);
    }
    input.InputContext.getCurrentContext().update(delta);
    activity.Activity.update(delta);
    if ((main.Engine.level) != null)
        main.Engine.level.update(delta);
    
    main.ResourceManager.update(delta);
    updateFPS();
}