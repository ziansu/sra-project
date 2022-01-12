@java.lang.Override
public jkind.lustre.Ast caseEnumTypeDef(com.rockwellcollins.spear.translate.lustre.com.rockwellcollins.spear.EnumTypeDef etd) {
    java.lang.String newName = mapping.get(etd.getName());
    java.util.List<java.lang.String> values = new java.util.ArrayList<>();
    for (com.rockwellcollins.spear.EnumValue ev : etd.getValues()) {
        values.add(ev.getName());
    }
    return new jkind.lustre.TypeDef(newName, new jkind.lustre.EnumType(newName, values));
}