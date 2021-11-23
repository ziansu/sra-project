public void executeCommand(int index) {
    int realIndex = -1;
    java.util.Iterator<com.zzzkvidi4.Command> iterator = commandList.iterator();
    while ((index >= 0) && (iterator.hasNext())) {
        if (iterator.next().isEnabled()) {
            --index;
        }
        realIndex++;
    } 
    commandList.get(realIndex).execute();
}