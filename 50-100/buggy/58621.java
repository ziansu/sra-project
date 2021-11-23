public void setColor(int level, com.badlogic.gdx.scenes.scene2d.Actor actor1, com.badlogic.gdx.scenes.scene2d.Actor actor2, com.badlogic.gdx.scenes.scene2d.Actor actor3) {
    int index = (level - 1) % (brightestColor.length);
    actor1.setColor(brightestColor[index]);
    actor2.setColor(normalColor[index]);
    actor3.setColor(darkestColor[index]);
}