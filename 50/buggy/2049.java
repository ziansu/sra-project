private boolean includes(org.eclipse.jface.text.Position position, int caretOffset) {
    return (position.includes(caretOffset)) || (((position.offset) + (position.length)) == caretOffset);
}