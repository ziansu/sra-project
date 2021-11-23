private void initDetector() {
    moduleFTCAL.initDetector();
    moduleFTHODO.initDetector();
    this.FTview1.addDetectorLayer(moduleFTCAL.drawDetector((-10.0), 0));
    this.FTview2.addDetectorLayer(moduleFTHODO.drawDetector((+10.0), 0.0));
    this.FTview1.addDetectorListener(this);
    this.FTview2.addDetectorListener(this);
}