@java.lang.Override
public int getItemViewType(int position) {
    return isPopular(getItem(position));
}