public void removePWMlistener(de.yadrone.base.navdata.PWMlistener pwmlistener) {
    this.pwmlistener.remove(pwmlistener);
    if ((this.pwmlistener.size()) == 0) {
        setMask(true, new int[]{ de.yadrone.base.navdata.NavDataManager.PWM_TAG });
    }
}