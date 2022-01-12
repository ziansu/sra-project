public void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    mUserIngredients = savedInstanceState.getStringArrayList("userIngredients");
    userInput.setText(savedInstanceState.getString("userInput"));
}