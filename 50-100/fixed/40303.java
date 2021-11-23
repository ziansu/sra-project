public void setPlace(int newPlace) {
    if (newPlace > 0) {
        com.openxcplatform.openxcstarter.InTransitActivity.ruleLat.add(com.openxcplatform.openxcstarter.InTransitActivity.lat);
        com.openxcplatform.openxcstarter.InTransitActivity.ruleLong.add(com.openxcplatform.openxcstarter.InTransitActivity.lng);
        com.openxcplatform.openxcstarter.InTransitActivity.place = java.lang.Math.min(((com.openxcplatform.openxcstarter.InTransitActivity.place) + newPlace), 255);
        try {
            wait(10000);
        } catch (java.lang.InterruptedException e) {
            java.lang.System.out.println("wait method inside setPlace() failed.");
            e.printStackTrace();
        }
    }
}