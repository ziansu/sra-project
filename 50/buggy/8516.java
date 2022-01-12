@java.lang.Override
public void concat(gov.nist.toolkit.errorrecording.ErrorRecorder er) {
    this.errMsgs.addAll(er.getErrMsgs());
}