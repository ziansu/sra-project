@org.junit.Before
public final void beforeIntegration() {
    nl.weeaboo.vn.Launcher launcher = new nl.weeaboo.vn.Launcher();
    launcher.create();
    novel = launcher.getNovel();
}