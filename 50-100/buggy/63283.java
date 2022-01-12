public Radioactivity_Sim.DecayChainRule puGetRule(int index) {
    if ((prNumRule) > 0) {
        if (index >= 0) {
            if (index < (prNumRule)) {
                return new Radioactivity_Sim.DecayChainRule(prRules[index]);
            }else {
                java.lang.System.out.println("(puGetRule) has failed! The supplied index is out of bounds!");
            }
        }else {
            java.lang.System.out.println("(puGetRule) has failed! The supplied index must be greater than zero!");
        }
    }else {
        java.lang.System.out.println("(puGetRule) has failed! There aren't any rules in this (DecayChainRuleBranch)!");
    }
    return new Radioactivity_Sim.DecayChainRule();
}