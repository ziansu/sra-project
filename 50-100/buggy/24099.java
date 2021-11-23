@java.lang.Override
public com.exposit.domain.model.sorokin.Bonus getCuitableBonus(java.lang.Double totalSpent) {
    if ((bonusRepository.getSuitableBonuses(totalSpent)) != null) {
        java.util.List<com.exposit.domain.model.sorokin.Bonus> suitableBonuses = bonusRepository.getSuitableBonuses(totalSpent);
        return suitableBonuses.get(((suitableBonuses.size()) - 1));
    }else
        return bonusRepository.getCurrentDefaultBonus();
    
}