@java.lang.Override
public void addErrorCodesForCheck(java.util.Set<java.lang.Integer> set, int level, int version, org.sbml.jsbml.validator.SBMLValidator.CHECK_CATEGORY category) {
    switch (category) {
        case GENERAL_CONSISTENCY :
            break;
        case IDENTIFIER_CONSISTENCY :
            set.add(org.sbml.jsbml.validator.offline.constraints.CORE_10313);
            break;
        case MATHML_CONSISTENCY :
            break;
        case MODELING_PRACTICE :
            break;
        case OVERDETERMINED_MODEL :
            break;
        case SBO_CONSISTENCY :
            break;
        case UNITS_CONSISTENCY :
            break;
    }
}