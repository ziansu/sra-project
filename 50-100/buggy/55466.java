@java.lang.Override
public void onButtonDown(int button) {
    if (button == 1) {
        org.newdawn.slick.geom.Vector2f pos = de.kryptondev.spacy.input.MouseInputManager.getInstance().getPosition();
        if ((lastMousePos) != pos) {
            lastMousePos = pos;
            de.kryptondev.spacy.SpacyClient.getInstance().getShip().rotateToMouse(pos);
            de.kryptondev.spacy.SpacyClient.getInstance().getClient().sendTCP(new de.kryptondev.spacy.share.PlayerRotate(SpacyClient.instance.getShip().direction));
        }
    }
}