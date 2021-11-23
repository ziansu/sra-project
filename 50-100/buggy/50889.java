public void setColorUnlimitedMode(int score, com.badlogic.gdx.scenes.scene2d.Actor background, com.badlogic.gdx.scenes.scene2d.Actor len2, com.badlogic.gdx.scenes.scene2d.Actor len3, com.badlogic.gdx.scenes.scene2d.Actor len4) {
    int index = score % (brightestColor.length);
    len2.setColor(brightestColor[index]);
    len3.setColor(normalColor[index]);
    len4.setColor(darkestColor[index]);
    background.setColor(normalColor[index]);
}