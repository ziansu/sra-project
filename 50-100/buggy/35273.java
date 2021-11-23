public void onClick(android.view.View arg0) {
    android.widget.Toast.makeText(getApplicationContext(), "msg msg", Toast.LENGTH_SHORT).show();
    final android.os.Bundle bundle = new android.os.Bundle();
    bundle.putString("Name", "Text Change");
    android.content.Intent myIntent = new android.content.Intent(this, bookshelfcompany.bookshelf.BookActivity.class);
    myIntent.putExtras(bundle);
    startActivity(myIntent);
}