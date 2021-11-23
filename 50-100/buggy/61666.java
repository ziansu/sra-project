public void switchScenes() {
    if ((currentRoot) == (draftLayout)) {
        votingLayout.setWorldMap(draftLayout.getWorldMap());
        primaryStage.getScene().setRoot(votingLayout);
        votingLayout.setWorldMap(getDraftLayout().getWorldMap());
        currentRoot = votingLayout;
        draftingPhase = false;
        votingLayout.onResize();
    }else {
        primaryStage.getScene().setRoot(draftLayout);
        currentRoot = draftLayout;
        draftingPhase = true;
    }
}