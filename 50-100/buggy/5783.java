@java.lang.Override
public void taskExecuted(org.apache.pivot.util.concurrent.Task<java.util.HashMap<java.lang.String, java.lang.String>> t) {
    if (isDome) {
        org.agmip.ui.quadui.QuadUIWindow.LOG.info("Dump to ACE Binary for DOMEs applied for {} successfully", fileName);
    }else {
        org.agmip.ui.quadui.QuadUIWindow.LOG.info("Dump to ACE Binary for {} successfully", fileName);
    }
    if (isDome) {
        reviseData(result);
        toOutput(result, t.getResult());
    }else
        if (acebOnly) {
            toOutput(result, t.getResult());
        }
    
}