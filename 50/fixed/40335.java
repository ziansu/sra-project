public void clearCompleted() {
    for (com.tkelly.splitthebill.Item item : items)
        item.setCompleted(false);
    
}