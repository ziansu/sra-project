public void switchScenes() {
    if ((currentRoot) == (draftLayout)) {
        primaryStage.getScene().setRoot(votingLayout);
        currentRoot = votingLayout;
        draftingPhase = false;
    }else {
        primaryStage.getScene().setRoot(draftLayout);
        currentRoot = draftLayout;
        draftingPhase = true;
    }
}