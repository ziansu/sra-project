public void convertBioTMLCorpusToAnote(com.silicolife.textmining.core.interfaces.process.IE.IIEProcess process, com.silicolife.textmining.machinelearning.biotml.core.interfaces.IBioTMLCorpus annotatedcorpus, com.silicolife.textmining.core.interfaces.core.report.processes.IREProcessReport report) throws com.silicolife.textmining.core.interfaces.core.dataaccess.exception.ANoteException, com.silicolife.textmining.machinelearning.biotml.core.exception.BioTMLException {
    if (process.getType().equals(ProcessTypeEnum.RE.toString())) {
        annotateREInAnote(annotatedcorpus, process, false, true, report);
    }
}