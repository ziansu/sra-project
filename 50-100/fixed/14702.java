public java.lang.String[] getActiveSplitVerb(edu.uw.easysrl.qasrl.qg.VerbHelper verbHelper) {
    java.lang.String[] result;
    if ((verbSlot.auxiliaries.size()) == 0) {
        result = verbHelper.getAuxiliaryAndVerbStrings(words, null, verbSlot.indexInSentence);
        if (verbSlot.hasParticle) {
            result[1] += " " + (words.get(verbSlot.particleIndex));
        }
    }else {
        result = getActiveVerb(verbHelper);
    }
    return result;
}