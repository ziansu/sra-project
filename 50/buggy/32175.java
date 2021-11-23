public void onClick(android.view.View v) {
    com.cards.flash.testez.EditCardFragment.cateObject = com.cards.flash.testez.NavigationDrawerFragment.getCurrCateObject();
    android.content.Intent intent = new android.content.Intent(getContext(), com.cards.flash.testez.ShareActivity.class);
    startActivity(intent);
}