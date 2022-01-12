public void addAcceleroListener(de.yadrone.base.navdata.AcceleroListener acceleroListener) {
    this.acceleroListener.add(acceleroListener);
    if ((this.acceleroListener.size()) == 1) {
        setMask(false, new int[]{ de.yadrone.base.navdata.NavDataManager.PHYS_MEASURES_TAG , de.yadrone.base.navdata.NavDataManager.RAW_MEASURES_TAG });
    }
}