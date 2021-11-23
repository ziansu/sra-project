@java.lang.Override
public org.luaj.vm2.Varargs execute(org.luaj.vm2.Varargs args) {
    me.scarlet.undertailor.util.LuaUtil.checkArguments(args, 2, 2);
    me.scarlet.undertailor.gfx.AnimationData animation = me.scarlet.undertailor.lua.lib.game.AnimationLib.check(args.arg(1)).getObject();
    animation.setRuntime((((long) (args.checkdouble(2))) * 1000));
    return org.luaj.vm2.LuaValue.NIL;
}