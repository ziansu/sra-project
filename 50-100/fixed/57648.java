@java.lang.Override
public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
    T oldItem = oldList.get(oldItemPosition);
    T newItem = newList.get(newItemPosition);
    boolean areTheSameInstance = oldItem == newItem;
    boolean hasTheSameType = oldItem.getClass().equals(newItem.getClass());
    boolean hasTheSameHash = (oldItem.hashCode()) == (newItem.hashCode());
    return areTheSameInstance || (hasTheSameType && hasTheSameHash);
}