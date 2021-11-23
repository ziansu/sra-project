@java.lang.Override
public void format(java.math.BigInteger number, java.lang.StringBuilder name) {
    insertAndIfNeeded(number, name);
    com.github.mealingr.numbername.util.StringUtils.capitaliseFirstCharacter(name);
}