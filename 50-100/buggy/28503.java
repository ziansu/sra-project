@java.lang.Override
public com.googlecode.lanterna.TerminalPosition fromGlobal(com.googlecode.lanterna.TerminalPosition globalPosition) {
    if (globalPosition == null) {
        return null;
    }
    return globalPosition.withRelative(((-(lastKnownPosition.getColumn())) - (contentOffset.getColumn())), ((-(lastKnownPosition.getRow())) - (contentOffset.getRow())));
}