public void NextLevelFunction(android.view.View view) {
    int nextLevelPosition = getIntent().getIntExtra("nextLevelPosition", (-1));
    if (nextLevelPosition < (MainActivity.gameCellArray.size())) {
        android.content.Intent intent = new android.content.Intent(this, marash.com.rebuspuzzle.selected_image.SelectedImageActivity.class);
        intent.putExtra("gameCellInfo", MainActivity.gameCellArray.get(nextLevelPosition));
        startActivity(intent);
    }else {
        android.content.Intent intent = new android.content.Intent(this, marash.com.rebuspuzzle.main_page.MainActivity.class);
        startActivity(intent);
    }
}