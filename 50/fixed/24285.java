private RaceAI.AI.Node _popLastNode(java.util.ArrayList<RaceAI.AI.Node> array) {
    int lastPos = (array.size()) - 1;
    RaceAI.AI.Node lastItem = array.get(lastPos);
    array.remove(lastPos);
    return lastItem;
}