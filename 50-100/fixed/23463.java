public void addVisionListener(de.yadrone.base.navdata.VisionListener visionListener) {
    this.visionListener.add(visionListener);
    if ((this.visionListener.size()) == 1) {
        setMask(false, new int[]{ de.yadrone.base.navdata.NavDataManager.DEMO_TAG , de.yadrone.base.navdata.NavDataManager.TRACKERS_SEND_TAG , de.yadrone.base.navdata.NavDataManager.VISION_DETECT_TAG , de.yadrone.base.navdata.NavDataManager.VISION_OF_TAG , de.yadrone.base.navdata.NavDataManager.VISION_TAG , de.yadrone.base.navdata.NavDataManager.VISION_PERF_TAG , de.yadrone.base.navdata.NavDataManager.VISION_RAW_TAG });
    }
}