public void ruleMaxEngSpd() {
    if ((com.openxcplatform.openxcstarter.InTransitActivity.getEng()) > 4000) {
        com.openxcplatform.openxcstarter.InTransitActivity.setPlace(40);
    }
    java.lang.System.out.println("running basic rules");
}