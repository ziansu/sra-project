public project.backend.MarsConfiguration genMinimumConfig(project.backend.ModuleSet modset, int numConf) {
    project.backend.MarsConfiguration config = new project.backend.MarsConfiguration(modset);
    boolean tits = false;
    tits = inVoid(config);
    if (numConf == 1) {
        makeMin1(config);
    }else {
        makeMin2(config);
    }
    if (inVoid(config)) {
        moveVoid(config);
    }
    tits = inVoid(config);
    return config;
}