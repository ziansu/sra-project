@java.lang.Override
public void generate(org.apache.log4j.Logger logger, exm.stc.common.CompilerBackend gen, exm.stc.ic.tree.ICTree.GenInfo info) {
    gen.startRangeLoop(loopName, loopVar, loopCounterVar, start, end, increment, splitDegree, leafDegree, passedVars, startIncrements, constStartIncrements);
    this.loopBody.generate(logger, gen, info);
    gen.endRangeLoop(splitDegree, endDecrements);
}