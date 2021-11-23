@java.lang.Override
public void run() {
    if (((items.size()) <= i) && ((items.size()) > 0))
        items.remove(i);
    
    notifyDataSetChanged();
    updateNumPredictions();
}