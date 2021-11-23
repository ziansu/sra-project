@java.lang.Override
public org.luaj.vm2.Varargs execute(org.luaj.vm2.Varargs varargs) {
    org.bukkit.block.Block block = getApi().getEntity().getEntity().getLocation().getBlock();
    block.setType(de.craften.plugins.educraft.luaapi.functions.PlaceBlockFunction.getMaterial(varargs.checkjstring(1)));
    getApi().moveTo(getApi().getLocation().clone().add(0, 1, 0), false);
    return org.luaj.vm2.LuaValue.NIL;
}