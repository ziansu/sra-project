@java.lang.Override
public void display(com.badlogic.gdx.graphics.g2d.Batch batch) {
    if (assetNeedUpdate)
        assetManager();
    
    chapter1Display(batch);
    if (!(viewingSettings)) {
        switch (chapterSection) {
            case 1 :
                drawBG(batch);
                break;
        }
    }
    if (ansCorrect) {
        fourPicsOneWordUtil.displayCorrect(batch);
        Gdx.input.setOnscreenKeyboardVisible(false);
    }
    drawQuizResult(batch);
}