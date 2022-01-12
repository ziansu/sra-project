public void propertyChange(org.eclipse.jface.util.PropertyChangeEvent event) {
    if (UsageDataCaptureSettings.CAPTURE_ENABLED_KEY.equals(event.getProperty())) {
        if (isTrue(event.getNewValue())) {
            service.startMonitoring();
        }else {
            service.stopMonitoring();
        }
    }else
        if (UsageDataCaptureSettings.SCREENSHOT_ACTIVATED_KEY.equals(event.getProperty())) {
            java.lang.System.out.println("PropertyChangeListener received change event");
            boolean newVal = isTrue(event.getNewValue());
            contextCapture.switchCaptureMode(newVal);
        }
    
}