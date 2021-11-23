public void onClick(android.view.View v) {
    try {
        android.os.AsyncTask task = new com.example.ownerperson.mindr.HttpDeleteRequest().execute(((MainActivity.baseURL) + "api/delete"), itemFinal, "item", name);
        java.lang.System.out.println(("This is final: " + itemFinal));
        task.get();
        buttons.removeView(deleteItemButton);
        buttons.removeView(listButton);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.toString());
        e.printStackTrace();
    }
}