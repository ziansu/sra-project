@java.lang.Override
public int compare(java.lang.String o1, java.lang.String o2) {
    opendct.capture.CaptureDevice c1 = opendct.sagetv.SageTVManager.getSageTVCaptureDevice(o1, true);
    opendct.capture.CaptureDevice c2 = opendct.sagetv.SageTVManager.getSageTVCaptureDevice(o2, true);
    if ((c1.getMerit()) > (c2.getMerit())) {
        return -1;
    }else
        if ((c1.getMerit()) < (c2.getMerit())) {
            return 1;
        }
    
    return 0;
}