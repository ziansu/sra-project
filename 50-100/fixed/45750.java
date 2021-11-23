private void passTime(int timePass) {
    buttonSound.play(((Gdx.app.getPreferences("tales-of-androgyny-preferences").getFloat("volume")) * 0.5F));
    time += timePass;
    console.setText((((saveService.saveDataValue(SaveEnum.HEALTH, (5 * timePass))) + "\n") + (saveService.saveDataValue(SaveEnum.TIME, timePass))));
    background.setColor(getTimeColor(time));
}