@java.lang.Override
public boolean isUpdateAble(budget.accessories.validators.Equity equity) {
    budget.accessories.validators.Equity inDB = equityRepository.get(equity.getIdentifier());
    return inDB.getType().equals(equity.getType());
}