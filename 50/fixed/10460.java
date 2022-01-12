@java.lang.Override
public boolean needsScores() {
    return ((this.valuesSources) == null) || (this.valuesSources.needsScores());
}