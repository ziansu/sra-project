@java.lang.Override
public com.github.cc007.mcsweeper.api.Field flag(int xPos, int yPos) {
    if ((knownField.getState(xPos, yPos)) <= (com.github.cc007.mcsweeper.api.Field.UNKNOWN_STATE)) {
        knownField.setState(xPos, yPos, Field.FLAG_STATE);
    }else
        if ((knownField.getState(xPos, yPos)) <= (com.github.cc007.mcsweeper.api.Field.FLAG_STATE)) {
            knownField.setState(xPos, yPos, Field.UNKNOWN_STATE);
        }
    
    return knownField;
}