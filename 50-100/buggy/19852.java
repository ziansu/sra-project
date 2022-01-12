public wyc.builder.Nominal resolveAsType(wyc.builder.SyntacticType type, wyc.lang.WhileyFile.Context context) {
    wyil.lang.Type nominalType = resolveAsType(type, context, true, false);
    wyil.lang.Type rawType = resolveAsType(type, context, false, false);
    wyc.builder.Nominal r = wyc.builder.Nominal.construct(nominalType, rawType);
    return r;
}