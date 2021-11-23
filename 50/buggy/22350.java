private void fireTouchEvent() {
    java.util.List<org.catrobat.catroid.content.Sprite> spriteList = org.catrobat.catroid.ProjectManager.getInstance().getCurrentProject().getSpriteList();
    for (org.catrobat.catroid.content.Sprite sprite : spriteList) {
        sprite.createTouchDownAction();
    }
}