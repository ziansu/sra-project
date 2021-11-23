private JvmType.Function convertFunType(wyjc.Type.FunctionOrMethod ft) {
    java.util.ArrayList<wyjc.JvmType> paramTypes = new java.util.ArrayList<wyjc.JvmType>();
    for (wyjc.Type pt : ft.params()) {
        paramTypes.add(wyjc.Wyil2JavaBuilder.convertType(pt));
    }
    wyjc.JvmType rt = wyjc.Wyil2JavaBuilder.convertType(ft.ret());
    return new wyjc.JvmType.Function(rt, paramTypes);
}