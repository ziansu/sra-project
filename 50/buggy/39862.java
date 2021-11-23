public void draw() {
    background(255);
    if ((currentMode) == (Main.Mode.INTRO))
        displayIntro();
    else
        if ((currentMode) == (Main.Mode.END))
            displayFinalTree();
        else
            displayTrees();
        
    
}