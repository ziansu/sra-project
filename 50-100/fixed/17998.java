@java.lang.Override
public void onClick(android.view.View v) {
    edu.sonoma.group.peg_master.Key temp = board.getChestAt(2).makeMove(kih);
    kih = new edu.sonoma.group.peg_master.Key(java.lang.Integer.parseInt(temp.getNumber()));
    updateGraphics();
    android.util.Log.d("b2", "Button 2 pressed");
    android.widget.Toast.makeText(getApplicationContext(), ("New kih:" + (kih.getNumber())), Toast.LENGTH_LONG).show();
}