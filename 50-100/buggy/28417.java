public void newProject() {
    try {
        loadedAT64 = "";
        projectObject.animFrameList = new java.util.ArrayList<se.oxidev.animtools64.AnimFrame>();
        projectObject.animFrameList.add(new se.oxidev.animtools64.AnimFrame(1, ""));
        currentAnimFrame = projectObject.animFrameList.get(0);
        menuItemSaveProject.setDisable(false);
        resetProjectInfo();
        redrawAll();
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.getMessage());
    }
}