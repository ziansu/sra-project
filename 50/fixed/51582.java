@java.lang.Override
public void importanceChanged(int i, int color) {
    if ((importance) != null)
        importance.setImageResource(com.todoroo.astrid.ui.EditTitleControlSet.IMPORTANCE_DRAWABLES[i]);
    
}