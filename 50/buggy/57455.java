@nl.weeaboo.lua2.lib2.LuaBoundFunction
public nl.weeaboo.lua2.vm.Varargs acos(nl.weeaboo.lua2.vm.Varargs args) {
    return nl.weeaboo.lua2.vm.LuaValue.valueOf(java.lang.Math.cos(args.checkdouble(1)));
}