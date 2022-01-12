public void onClick(android.view.View v) {
    if (!(userChoice.isEmpty())) {
        android.content.Intent toNavigation = new android.content.Intent(this, com.wordpress.kaiyima.autismappjam.NavigationListActivity.class);
        toNavigation.putExtra("userName", userChoice);
        startActivity(toNavigation);
    }else {
        android.widget.Toast.makeText(this, "You need to choose a user first before entering the Magic World", Toast.LENGTH_LONG).show();
    }
}