public void invoke(int nargs, int slot) {
    switch (nargs) {
        case -1 :
            break;
        case 0 :
            loadNone();
            break;
        case 1 :
            break;
        case 2 :
            org.squiddev.cobalt.luajc.compilation.METHOD_VARARGS_ONE.inject(main);
            break;
        case 3 :
            org.squiddev.cobalt.luajc.compilation.METHOD_VARARGS_TWO.inject(main);
            break;
        default :
            throw new java.lang.IllegalArgumentException((("can't invoke with " + nargs) + " args"));
    }
    org.squiddev.cobalt.luajc.utils.AsmUtils.constantOpcode(main, slot);
    org.squiddev.cobalt.luajc.compilation.METHOD_INVOKE_VAR.inject(main);
}