@java.lang.Override
public void set(org.squiddev.cobalt.LuaState state, org.squiddev.cobalt.LuaValue key, org.squiddev.cobalt.LuaValue value) {
    if ((metatable) == null) {
        throw new org.squiddev.cobalt.LuaError((("cannot set " + key) + " for userdata"));
    }else {
        org.squiddev.cobalt.OperationHelper.setTable(state, this, key, value);
    }
}