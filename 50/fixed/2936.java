@java.lang.Override
public boolean check(org.sbml.jsbml.validator.offline.ValidationContext ctx, org.sbml.jsbml.Model m) {
    org.sbml.jsbml.validator.OverdeterminationValidator val = new org.sbml.jsbml.validator.OverdeterminationValidator(m);
    return !(val.isOverdetermined());
}