private void valueToSpecial(org.squiddev.luaj.luajc.analysis.type.BasicType type, int pc) {
    switch (type) {
        case BOOLEAN :
            assertType(LuaValue.TBOOLEAN, pc);
            org.squiddev.luaj.luajc.compilation.METHOD_VALUE_TO_BOOL.inject(main);
            break;
        case NUMBER :
            assertType(LuaValue.TNUMBER, pc);
            org.squiddev.luaj.luajc.compilation.METHOD_VALUE_TO_NUMBER.inject(main);
            break;
        default :
            throw new java.lang.IllegalStateException((("Type " + type) + " is not a specialist type"));
    }
}