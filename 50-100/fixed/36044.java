public void removeRangeOfItems(@android.support.annotation.IntRange(from = 0)
int from, @android.support.annotation.IntRange
int to) {
    if (((items.size()) > from) && ((items.size()) > to)) {
        for (int i = from; i < to; i++) {
            items.remove(i);
        }
        notifyDataSetChanged();
    }
}