public LinkedList<Node> applyOperators(Node node) {
    for (Char operator : operators) {
        if (facingEdge(node)) {
            switch (operator) {
                case 'R' :
                    rotateRight(Node);
                    break;
                case 'L' :
                    rotateLeft(Node);
                    break;
            }
        }else {
            switch (operator) {
                case 'F' :
                    moveForward(Node);
                    break;
                case 'R' :
                    rotateRight(Node);
                    break;
                case 'L' :
                    rotateLeft(Node);
                    break;
            }
        }
    }
}