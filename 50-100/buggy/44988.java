private void invisibleMessage() {
    if (configPrefs.UserGender().get().equals("MALE")) {
        characterGoalBoy.setVisibility(View.VISIBLE);
    }else {
        characterGoalGirl.setVisibility(View.VISIBLE);
    }
    textGoal.setVisibility(View.VISIBLE);
    layerMessageBalloon.setVisibility(View.INVISIBLE);
    textMessageBalloon.setVisibility(View.INVISIBLE);
}