public edu.mit.csail.sdg.alloy4compiler.translator.A4Solution nextNearHit(edu.mit.csail.sdg.alloy4.A4Reporter rep) {
    java.lang.String constraint2 = this.previousMissString;
    currentHit = edu.uw.ece.bordeaux.util.Utils.and(currentHit, previousHitString);
    java.lang.String constraint1 = currentHit;
    edu.mit.csail.sdg.alloy4compiler.translator.A4Solution result = this.perform(rep, this.inputPath, constraint1, constraint2);
    this.previousHitString = edu.uw.ece.bordeaux.util.ExtractorUtils.convertBordeauxSolutionToAlloySyntax(result, true).a;
    return edu.uw.ece.bordeaux.util.ExtractorUtils.convertBordeauxSolutionToAlloySolution(result).a;
}