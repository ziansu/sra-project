private void sortUp(uk.sliske.rs.map.webwalker.Node item) {
    while (true) {
        int parentIndex = ((item.heapIndex) - 1) / 2;
        uk.sliske.rs.map.webwalker.Node parentItem = data[parentIndex];
        if ((item.compareTo(parentItem)) > 0) {
            swap(item, parentItem);
        }else {
            break;
        }
    } 
}