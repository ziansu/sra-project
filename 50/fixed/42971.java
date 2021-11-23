@java.lang.Override
public void refreshDocList(int position, int action) {
    if ((docList) == null)
        return ;
    
    docList.getAdapter().notifyDataSetChanged();
}