public void init() {
    logic.Func f = Yaka.tabIdent.getFunc(YakaTokenManager.identRead);
    if (f == null) {
        generation.PrintError.unknownVariable(YakaTokenManager.identRead);
    }
    names.push(YakaTokenManager.identRead);
    currentParam.push(0);
    functions.push(f);
    Yaka.yvm.reserveRetour();
}