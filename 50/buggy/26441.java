public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.example.leoyoon.habittracker.AddHabit.class);
    intent.putExtra("habitList", habitList);
    startActivity(intent);
}