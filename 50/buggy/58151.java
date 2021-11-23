@java.lang.Override
public boolean hasChanges(com.todoroo.astrid.data.Task original) {
    return !(selectedList.equals(originalList));
}