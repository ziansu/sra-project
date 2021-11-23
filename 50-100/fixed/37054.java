@java.lang.Override
public boolean canConvert(org.apache.calcite.plan.RelOptPlanner planner, org.apache.calcite.plan.volcano.TraitConversionTest.SimpleDistribution fromTrait, org.apache.calcite.plan.volcano.TraitConversionTest.SimpleDistribution toTrait) {
    if (((fromTrait == toTrait) || (toTrait == (simpleDistributionAny))) || ((fromTrait == (simpleDistributionSingleton)) && (toTrait == (simpleDistributionRandom)))) {
        return true;
    }
    return false;
}