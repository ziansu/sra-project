public synchronized org.eclipse.koneki.ldt.parser.ast.LuaSourceRoot buildAST(final java.lang.String string) {
    if ((lua) == null)
        lua = loadLuaModule();
    
    pushLuaModule(lua);
    lua.getField((-1), "build");
    lua.pushString(string);
    lua.call(1, 1);
    org.eclipse.koneki.ldt.parser.ast.LuaSourceRoot luaSourceRoot = lua.checkJavaObject((-1), org.eclipse.koneki.ldt.parser.ast.LuaSourceRoot.class);
    lua.pop(2);
    return luaSourceRoot;
}