private void setViewPrevious() {
    java.lang.System.out.println("Previous");
    model.InventoryItem previousItem = viewList.pPrev();
    if (previousItem != null)
        tab.setView(viewList.pPrev());
    
}