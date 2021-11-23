public void onClick(android.view.View v) {
    java.lang.String drinkName = ((android.widget.TextView) (v)).getText().toString();
    for (com.example.kines.myapplication.Drink d : filteredData) {
        if (d.getName().equals(drinkName)) {
            android.content.Intent intent = new android.content.Intent(v.getContext(), com.example.kines.myapplication.OpenRecipeActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("ListViewClick", d);
            v.getContext().startActivity(intent);
        }
    }
}