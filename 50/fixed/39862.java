public void draw() {
    background(255);
    if ((currentMode) == 0)
        displayIntro();
    else
        if (end)
            displayFinalTree();
        else
            displayTrees();
        
    
    java.lang.System.out.println(currentMode);
}