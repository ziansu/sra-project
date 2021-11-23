@java.lang.Override
public void onClick(android.view.View arg0) {
    int i = spinnertupian.getSelectedItemPosition();
    java.lang.String tmp = ((java.lang.String) (listtupian.get(i)));
    deletefile(tmp);
    listtupian.remove(i);
    setspinnershanchu();
}