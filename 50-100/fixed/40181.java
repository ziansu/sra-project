public void editAction(android.view.View v) {
    int position = java.lang.Integer.parseInt(v.getTag().toString());
    android.content.Intent intent = new android.content.Intent(this, com.przyjaznyplanDisplayer.mymodule.appmanager.Czynnosci.ActionAddEditView.class);
    intent.putExtra("SLIDE", activity.getSlides().get(position));
    intent.putExtra("POSITION", position);
    startActivityForResult(intent, RequestCodes.ACTION_EDIT);
}