@java.lang.Override
public boolean keyTyped(char character) {
    if (readInput) {
        input.append(character);
        addChar(character);
    }
    return false;
}