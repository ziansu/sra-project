public static long getCoordinates(com.vladsch.MissingInActions.manager.Caret caret) {
    com.vladsch.MissingInActions.manager.LogicalPosition logicalPosition = caret.getLogicalPosition();
    return (((long) (logicalPosition.line)) << 32) | (logicalPosition.column);
}