public void onClick(android.view.View v) {
    dbHandler.deleteItem(buttonName);
    linearLayout.removeView(button);
}