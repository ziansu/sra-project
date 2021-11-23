@java.lang.Override
public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
    java.lang.String oldId = mOld.get(oldItemPosition).getMediaId();
    java.lang.String newId = mNew.get(newItemPosition).getMediaId();
    return oldId != null ? oldId.equals(newId) : newId == null;
}