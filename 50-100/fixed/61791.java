@java.lang.Override
public eis.iilang.Parameter[] translate(nl.tytech.data.engine.item.Zone z) throws eis.eis2java.exception.TranslationException {
    return new eis.iilang.Parameter[]{ new eis.iilang.Function("Zone", new eis.iilang.Numeral(z.getID()), new eis.iilang.Identifier(z.getName()), new eis.iilang.Numeral(z.getMaxAllowedFloors()), new eis.iilang.Numeral(size(z)), translator.translate2Parameter(z.getAllowedCategories())[0], translator.translate2Parameter(getfunctionsID(z))[0]) };
}