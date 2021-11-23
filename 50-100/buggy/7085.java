public void setSelected(ru.sukharev.pathtracker.utils.orm.MapPath path) {
    if (((selectedPath) != null) && (mObjects.contains(selectedPath)))
        notifyItemChanged(mObjects.indexOf(selectedPath));
    
    selectedPath = path;
    if (mObjects.contains(selectedPath))
        notifyItemChanged(mObjects.indexOf(selectedPath));
    
}