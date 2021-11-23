public LinkedList<Node> applyOperators(Node node) {
    for (Char operator : operators) {
        if (facingEdge(node)) {
            switch (operator) {
                case 'R' :
                    rotateRight(node);
                    break;
                case 'L' :
                    rotateLeft(node);
                    break;
            }
        }else {
            switch (operator) {
                case 'F' :
                    moveForward(node);
                    break;
                case 'R' :
                    rotateRight(node);
                    break;
                case 'L' :
                    rotateLeft(node);
                    break;
            }
        }
    }
}