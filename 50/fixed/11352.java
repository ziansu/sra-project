@java.lang.Override
public float computeBonus() {
    float bonus = ((this.salary) * (this.pctBonus)) + 1000;
    return bonus;
}