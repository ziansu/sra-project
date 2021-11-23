public void onClick(android.view.View arg0) {
    final android.os.Bundle bundle = new android.os.Bundle();
    bundle.putString("Name", "Text Change");
    android.content.Intent myIntent = new android.content.Intent(this, bookshelfcompany.bookshelf.BookActivity.class);
    myIntent.putExtras(bundle);
    startActivity(myIntent);
}