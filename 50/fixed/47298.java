@java.lang.Override
public void setParameters() {
    this.outputfile = this.inputfile;
    switch (currentConfiguration) {
        case Modules.stats.ContaminationEstimatorMT.DEFAULT :
            this.parameters = getDefaultParams();
            break;
        case Modules.stats.ContaminationEstimatorMT.NOTPREDC :
            this.parameters = getNotPredCParams();
            break;
    }
}