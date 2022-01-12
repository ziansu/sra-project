public void customMaxVehSpd(int maxSpd) {
    if ((com.openxcplatform.openxcstarter.InTransitActivity.getVeh()) > maxSpd) {
        com.openxcplatform.openxcstarter.InTransitActivity.setPlace(80, 1, com.openxcplatform.openxcstarter.InTransitActivity.getVeh());
    }
}