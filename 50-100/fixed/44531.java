public void startGame(android.view.View v) {
    android.content.SharedPreferences sp = this.getSharedPreferences("com.example.yo_pc.compasssurvival", 0);
    if (!(welcome.toString().equals("Name doesn't establisheddd"))) {
        android.content.Intent intent = new android.content.Intent(this, com.example.yo_pc.compasssurvival.PopUpMapas.class);
        startActivity(intent);
    }else {
        showToastMessage("Wait, I need your name!");
    }
}