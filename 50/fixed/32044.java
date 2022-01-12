public void ruleMaxEngSpd() {
    if ((com.openxcplatform.openxcstarter.InTransitActivity.getEng()) > 4000) {
        com.openxcplatform.openxcstarter.InTransitActivity.setPlace(40, 1, com.openxcplatform.openxcstarter.InTransitActivity.getEng());
    }
}