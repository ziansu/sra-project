protected void on_Destroy() {
    try {
        if ((vuforiaAppSession) != null)
            vuforiaAppSession.stopAR();
        
    } catch (com.gigigo.vuforiacore.sdkimagerecognition.vuforiaenvironment.VuforiaException e) {
        com.gigigo.ggglogger.GGGLogImpl.log(e.getMessage(), LogLevel.ERROR);
    }
    java.lang.System.gc();
}