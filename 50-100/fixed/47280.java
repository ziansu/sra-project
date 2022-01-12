@java.lang.Override
public void onClick(android.view.View arg0) {
    int i = spinnertupian.getSelectedItemPosition();
    if (i < 0)
        return ;
    
    java.lang.String tmp = ((java.lang.String) (listtupian.get(i)));
    if (tmp == null)
        return ;
    
    deletefile(tmp);
    listtupian.remove(i);
    setspinnershanchu();
}