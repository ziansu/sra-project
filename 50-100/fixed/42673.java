private static boolean hasDirectLeftRecursion(common.cfg.CfgProductionRule rule) {
    if ((rule.getLhs().equals(rule.getRhs()[0])) && ((rule.getRhs().length) > 1)) {
        return true;
    }else {
        return false;
    }
}