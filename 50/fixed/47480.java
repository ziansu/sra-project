@java.lang.Override
public int getItemCount() {
    if ((sizeCollection.size()) < 10) {
        return sizeCollection.size();
    }else {
        return 10;
    }
}