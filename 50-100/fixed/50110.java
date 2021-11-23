public void globalChecking(java.util.ArrayList<BasicElement.PositionInPanel> allPos, int selfNumber) {
    for (int i = 0; i < (allPos.size()); i++) {
        if ((i != selfNumber) && (pos.isOverlapping(allPos.get(i)))) {
            currentState.stateString.clear();
            currentState.stateString.add("collis");
            break;
        }
    }
}