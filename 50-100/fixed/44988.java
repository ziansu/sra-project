private void invisibleMessage() {
    if (configPrefs.UserGender().get().equals("MALE")) {
        characterGoalGirl.setVisibility(View.VISIBLE);
    }else {
        characterGoalBoy.setVisibility(View.VISIBLE);
    }
    textGoal.setVisibility(View.VISIBLE);
    layerMessageBalloon.setVisibility(View.INVISIBLE);
    textMessageBalloon.setVisibility(View.INVISIBLE);
}