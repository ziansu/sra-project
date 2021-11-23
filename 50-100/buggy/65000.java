@java.lang.Override
public org.openimmunizationsoftware.cdsi.core.logic.items.LogicResult evaluateInternal() {
    java.util.List<org.openimmunizationsoftware.cdsi.core.domain.RequiredGender> rg = caRequiredGender.getFinalValue();
    if (rg == null) {
        return org.openimmunizationsoftware.cdsi.core.logic.items.LogicResult.YES;
    }
    if (caRequiredGender.getFinalValue().contains(caGender.getFinalValue())) {
        return org.openimmunizationsoftware.cdsi.core.logic.items.LogicResult.YES;
    }
    return org.openimmunizationsoftware.cdsi.core.logic.items.LogicResult.YES;
}