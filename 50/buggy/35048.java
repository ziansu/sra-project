@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.darly.dlclent.model.SecMenuModel model = ((com.darly.dlclent.model.SecMenuModel) (parent.getItemAtPosition(position)));
    thrOutListToCheckMenu(model, position);
}