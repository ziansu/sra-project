public boolean startCycle() {
    switch (this.cycleType) {
        case "Regular" :
            this.handler.setCycle("Regular");
            this.handler.start_wash();
            break;
        case "Perm-Press" :
            this.handler.setCycle("Perm-Press");
            break;
        case "Delicates" :
            this.handler.setCycle("Delicates");
            break;
    }
    return true;
}