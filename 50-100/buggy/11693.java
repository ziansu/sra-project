private boolean isListOperation(int command) {
    return (((((command == (INDEX_ADD)) || (command == (INDEX_EDIT))) || (command == (INDEX_DELETE))) || (command == (INDEX_COMPLETE))) || (command == (INDEX_OVERDUE))) || (command == (INDEX_INCOMPLETE));
}