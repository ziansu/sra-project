private void setViewNext() {
    java.lang.System.out.println("Next");
    model.InventoryItem nextItem = viewList.pPrev();
    if (nextItem != null)
        tab.setView(viewList.pNext());
    
}