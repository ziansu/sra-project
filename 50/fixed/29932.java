@java.lang.Override
public void create() {
    batch = new com.badlogic.gdx.graphics.g2d.SpriteBatch();
    controller = new sem.group15.bubblebobble.core.LogicController();
    controller.addGameObject(new sem.group15.bubblebobble.core.objects.PlayerObject(250.0F, 250.0F));
}