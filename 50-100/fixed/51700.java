public void checkBubbles() {
    java.util.Iterator<model.Bubble> i = bubbles.iterator();
    while (i.hasNext()) {
        model.Bubble bubble = i.next();
        if ((bubble.checkPop()) && (!(bubble.getIsPrisonBubble()))) {
            i.remove();
            levelController.getScreenController().removeSprite(bubble);
            utility.Logger.log("Bubble is popped");
        }
    } 
}