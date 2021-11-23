public int compare(edu.unc.ceccr.chembench.actions.ViewPredictor.descriptorFrequency df1, edu.unc.ceccr.chembench.actions.ViewPredictor.descriptorFrequency df2) {
    if ((df1.getNumOccs()) > (df2.getNumOccs())) {
        return -1;
    }else
        if ((df2.getNumOccs()) < (df2.getNumOccs())) {
            return 1;
        }else {
            return 0;
        }
    
}