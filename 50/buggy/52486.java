@android.webkit.JavascriptInterface
public void reset() {
    stack.clear();
    nStep = -1;
    this.play = true;
    gameStates.clear();
    if ((lins) != null)
        lins.clear();
    
}