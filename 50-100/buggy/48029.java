public void removeVisionListener(de.yadrone.base.navdata.VisionListener visionListener) {
    this.visionListener.remove(visionListener);
    setMask(((this.visionListener.size()) == 0), new int[]{ de.yadrone.base.navdata.NavDataManager.DEMO_TAG , de.yadrone.base.navdata.NavDataManager.TRACKERS_SEND_TAG , de.yadrone.base.navdata.NavDataManager.VISION_DETECT_TAG , de.yadrone.base.navdata.NavDataManager.VISION_OF_TAG , de.yadrone.base.navdata.NavDataManager.VISION_TAG , de.yadrone.base.navdata.NavDataManager.VISION_PERF_TAG , de.yadrone.base.navdata.NavDataManager.VISION_RAW_TAG });
}