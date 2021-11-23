public static boolean hasDirectLeftRecursion(common.cfg.Cfg cfg) {
    for (common.cfg.CfgProductionRule rule : cfg.getProductionRules()) {
        if (rule.getLhs().equals(rule.getRhs()[0])) {
            return true;
        }
    }
    return false;
}