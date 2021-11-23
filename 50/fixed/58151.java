@java.lang.Override
public boolean hasChanges(com.todoroo.astrid.data.Task original) {
    return ((selectedList) != null) && (!(selectedList.equals(originalList)));
}