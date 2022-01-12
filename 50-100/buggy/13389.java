public void BFSsearch(State Thestate) {
    Node root = new Node(null, null, null, null, Thestate, "");
    BFSMoves.push("TURN_ON");
    while ((FoundDirts.size()) != (dirts.size())) {
        BFSsearch(root);
    } 
    BFSMoves.push("TURN_OFF");
}