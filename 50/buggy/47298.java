@java.lang.Override
public void setParameters() {
    this.outputfile = this.inputfile;
    switch (currentConfiguration) {
        case Modules.stats.ContaminationEstimatorMT.DEFAULT :
            getDefaultParams();
            break;
        case Modules.stats.ContaminationEstimatorMT.NOTPREDC :
            getNotPredCParams();
            break;
    }
    this.parameters = getDefaultParams();
}