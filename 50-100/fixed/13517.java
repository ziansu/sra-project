public void init() {
    logic.Func f = Yaka.tabIdent.getFunc(YakaTokenManager.identRead);
    if (f == null) {
        generation.PrintError.unknownVariable(YakaTokenManager.identRead);
    }else {
        currentParam.push(0);
        functions.push(f);
    }
    names.push(YakaTokenManager.identRead);
    Yaka.yvm.reserveRetour();
}