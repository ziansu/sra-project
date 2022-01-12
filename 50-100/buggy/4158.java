public void runSync(config.Config cfg, config.Options option) {
    java.util.List<java.lang.String> scenarios = option.getScenarioList();
    for (java.lang.String s : scenarios) {
        java.lang.String s_name = get_scenario_name(s);
        int s_count = get_loop_count(s);
        for (int i = 0; i < s_count; i++) {
            new controller.Ruberdriver(cfg, s_name).run();
        }
    }
    scenarios = null;
}