private void moveRight(int t) {
    alignment[t] = alignment[(t - 1)];
    fr.loria.synalp.jtransxps.XPMInimizeVars.EtatHMM eLost = alignment[t];
    eLost.removeOneFrame(frames[t]);
    float vLost = eLost.getVar();
    fr.loria.synalp.jtransxps.XPMInimizeVars.EtatHMM eGain = alignment[(t - 1)];
    eGain.updateOneFrame(frames[t]);
    float vGain = eGain.getVar();
    globalVar += vGain - vLost;
}