private static java.lang.String printValue(de.codesourcery.luaparser.antlr.LuaParser.ExpContext value) {
    if ((value.getChild(0)) instanceof de.codesourcery.luaparser.antlr.LuaParser.TableconstructorContext) {
        return de.codesourcery.luaparser.LuaToJSON.printValue(((de.codesourcery.luaparser.antlr.LuaParser.TableconstructorContext) (value.getChild(0))), false);
    }
    if ((value.getChild(0)) instanceof de.codesourcery.luaparser.antlr.LuaParser.PrefixexpContext) {
        return de.codesourcery.luaparser.LuaToJSON.printValue(value.getChild(0));
    }
    return de.codesourcery.luaparser.LuaToJSON.evaluate(value).toString();
}