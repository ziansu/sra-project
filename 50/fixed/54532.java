public static long getCoordinates(com.vladsch.MissingInActions.manager.LogicalPosition logicalPosition) {
    return (((long) (logicalPosition.line)) << 32) | (logicalPosition.column);
}