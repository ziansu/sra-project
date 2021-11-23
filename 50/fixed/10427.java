@java.lang.Override
public int getItemCount() {
    if ((groupses) == null)
        return 0;
    
    return (groupses.size()) / (userClass.getSizeGroups());
}