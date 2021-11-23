@java.lang.Override
public void doRender(float delta) {
    super.doRender(delta);
    getManager().getScreen(ScreenName.Game).render(0);
}