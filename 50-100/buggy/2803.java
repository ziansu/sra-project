private java.lang.String getTarget(java.lang.String type, java.lang.String name) {
    java.util.List<java.lang.String[]> targets = cmdline.getTargets(type);
    for (java.lang.String[] target : targets) {
        if ((name.equals(target[1])) && ((!("npc".equals(type))) || (!(target[0].startsWith("bad_target_"))))) {
            return target[0];
        }
    }
    return null;
}