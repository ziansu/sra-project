public void run(java.util.ArrayList<br.com.webgoal.sharedshoppinglist.Item> items) {
    int index = itemFromList(items);
    if (index > 0)
        items.remove(index);
    
}