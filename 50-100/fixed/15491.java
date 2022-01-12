public com.schoovello.ai.treesearch.rubiks.RubState.Face rightFace() {
    switch (this) {
        case FRONT :
            return com.schoovello.ai.treesearch.rubiks.RubState.Face.RIGHT;
        case BACK :
            return com.schoovello.ai.treesearch.rubiks.RubState.Face.LEFT;
        case LEFT :
            return com.schoovello.ai.treesearch.rubiks.RubState.Face.FRONT;
        case RIGHT :
            return com.schoovello.ai.treesearch.rubiks.RubState.Face.BACK;
        case UP :
            return com.schoovello.ai.treesearch.rubiks.RubState.Face.RIGHT;
        case DOWN :
            return com.schoovello.ai.treesearch.rubiks.RubState.Face.RIGHT;
        default :
            return null;
    }
}