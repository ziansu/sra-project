public void unaryOp(int o) {
    java.lang.String op;
    switch (o) {
        default :
        case org.squiddev.cobalt.Lua.OP_UNM :
            op = "neg";
            break;
        case org.squiddev.cobalt.Lua.OP_NOT :
            op = "not";
            break;
        case org.squiddev.cobalt.Lua.OP_LEN :
            op = "length";
            break;
    }
    main.visitMethodInsn(org.squiddev.cobalt.luajc.compilation.INVOKESTATIC, org.squiddev.cobalt.luajc.compilation.CLASS_OPERATION, op, (((("(" + (TYPE_STATE)) + (TYPE_LUAVALUE)) + ")") + (TYPE_LUAVALUE)), false);
}