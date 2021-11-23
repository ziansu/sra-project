public void register(se.wowsim.spells.types.DamageIncrease n) {
    if (damageIncreases.contains(n)) {
        n.incrementStacks();
        java.lang.System.out.println((((n.getName()) + " reapplied to target, current stacks: ") + (n.getCurrentStacks())));
    }else {
        damageIncreases.add(n);
        n.incrementStacks();
        java.lang.System.out.println(((n.getName()) + " applied to target"));
    }
}