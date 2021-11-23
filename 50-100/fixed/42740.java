public void computersPick() {
    com.example.a00.tictactoegame.MainActivity.random = new java.util.Random();
    int rand = com.example.a00.tictactoegame.MainActivity.random.nextInt(9);
    android.widget.Button button = com.example.a00.tictactoegame.MainActivity.buttonList.get(rand);
    if ((button.getAlpha()) == 0.25F) {
        button.setBackgroundResource(R.drawable.o_icon);
        button.setAlpha(1.0F);
        button.setClickable(false);
        com.example.a00.tictactoegame.MainActivity.List[rand] = com.example.a00.tictactoegame.MainActivity.o;
    }else {
        computersPick();
    }
}