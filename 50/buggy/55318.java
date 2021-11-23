public void onClick(android.content.DialogInterface dialog, int whichButton) {
    com.bas.tagger.Node node = nodes.get(position);
    android.widget.Toast.makeText(context, ("adding use to " + (node.uuid)), Toast.LENGTH_SHORT).show();
}