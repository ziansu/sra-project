public void removeItemRange(@android.support.annotation.IntRange(from = 0)
int start, @android.support.annotation.IntRange(from = 0)
int end) {
    if ((start < (items.size())) && (end < (items.size()))) {
        for (int i = start; i < end; i++) {
            items.remove(i);
        }
        notifyDataSetChanged();
    }
}