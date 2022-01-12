@java.lang.Override
public void generate(org.apache.log4j.Logger logger, exm.stc.common.CompilerBackend gen, exm.stc.ic.tree.ICTree.GenInfo info) {
    gen.startForeachLoop(loopName, container, loopVar, loopCounterVar, splitDegree, leafDegree, containerClosed, passedVars, startIncrements, constStartIncrements, endDecrements);
    this.loopBody.generate(logger, gen, info);
    gen.endForeachLoop(splitDegree, containerClosed, endDecrements);
}