public uk.ac.tgac.rampart.stage.analyse.asm.stats.AssemblyStats getBest() {
    double max = 0.0;
    uk.ac.tgac.rampart.stage.analyse.asm.stats.AssemblyStats best = null;
    for (uk.ac.tgac.rampart.stage.analyse.asm.stats.AssemblyStats stats : this) {
        if ((stats.getFinalScore()) > max) {
            best = stats;
            max = stats.getFinalScore();
        }
    }
    return best;
}