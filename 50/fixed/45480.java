@java.lang.Override
public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    int page = (pagedScrollPane.getCurrentPage()) - 1;
    if (page >= 1)
        pagedScrollPane.scrollToPage(page);
    
}