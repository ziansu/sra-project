public void removeAcceleroListener(de.yadrone.base.navdata.AcceleroListener acceleroListener) {
    this.acceleroListener.remove(acceleroListener);
    if ((this.acceleroListener.size()) == 0) {
        setMask(true, new int[]{ de.yadrone.base.navdata.NavDataManager.PHYS_MEASURES_TAG , de.yadrone.base.navdata.NavDataManager.RAW_MEASURES_TAG });
    }
}