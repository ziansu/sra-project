private boolean shouldCache(gw.lang.reflect.gs.ICompilableType gsClass) {
    return !(Gosu.GOSU_SCRATCHPAD_FQN.equals(gsClass.getName()));
}