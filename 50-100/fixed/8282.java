private void moveLeft(int t) {
    fr.loria.synalp.jtransxps.XPMInimizeVars.EtatHMM eLost = alignment[t];
    globalVar -= eLost.getVar();
    eLost.removeOneFrame(frames[t]);
    globalVar += eLost.getVar();
    fr.loria.synalp.jtransxps.XPMInimizeVars.EtatHMM eGain = alignment[(t + 1)];
    globalVar -= eGain.getVar();
    eGain.updateOneFrame(frames[t]);
    globalVar += eGain.getVar();
    alignment[t] = alignment[(t + 1)];
}