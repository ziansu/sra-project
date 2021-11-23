private int setParam(int param, int value) {
    return ru.threedisevenzeror.xmpwrapper.Xmp.checkError(ru.threedisevenzeror.xmpwrapper.Xmp.lib.xmp_set_player(context, param, value));
}