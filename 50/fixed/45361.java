public void onEditClick(android.view.View view) {
    android.content.Intent newIntent = new android.content.Intent(this, com.example.aaron.welcomeActivity.editBudgetActivity.class);
    com.example.aaron.welcomeActivity.Budget transferBudget = currentBudget;
    newIntent.putExtra("Budget", transferBudget);
    startActivity(newIntent);
}