public void timeout() {
    jobStatus = dk.lessismore.nojpa.masterworker.JobStatus.DONE;
    kill();
    if (!(result.hasValue())) {
        dk.lessismore.nojpa.masterworker.client.JobHandle.log.error("SETTING RESULT TO NULL -TIMEOUT.....!!!!");
        result.setValue(new dk.lessismore.nojpa.utils.Pair<O, java.lang.RuntimeException>(null, new dk.lessismore.nojpa.masterworker.exceptions.TimeoutException()));
    }else {
        result.resignal();
    }
}