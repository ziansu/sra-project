@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    if ((s.getSelectedItem()) == null)
        return ;
    
    counter.load(s.getSelectedItem().toString());
}