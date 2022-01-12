private void createProject() {
    org.catrobat.catroid.content.Project project = new org.catrobat.catroid.content.Project(null, org.catrobat.catroid.uitest.util.UiTestUtils.DEFAULT_TEST_PROJECT_NAME);
    org.catrobat.catroid.content.Sprite sprite = new org.catrobat.catroid.content.Sprite("testsprite");
    org.catrobat.catroid.content.Script script = new org.catrobat.catroid.content.StartScript();
    script.addBrick(new org.catrobat.catroid.content.bricks.NoteBrick(noteFormula));
    sprite.addScript(script);
    project.addSprite(sprite);
    org.catrobat.catroid.ProjectManager.getInstance().setProject(project);
    org.catrobat.catroid.ProjectManager.getInstance().setCurrentSprite(sprite);
    org.catrobat.catroid.ProjectManager.getInstance().setCurrentScript(script);
}