public void setPlanType(int pT) {
    synchronized(this) {
        Strategy.logger.info(("PLAN CHANGED : " + (this.planType)));
        this.planType = pT;
    }
}