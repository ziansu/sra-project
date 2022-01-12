@java.lang.Override
public void onClick(android.view.View v) {
    java.util.Random randomNext = new java.util.Random();
    int index = randomNext.nextInt(20);
    x = index;
    randomText.setText((((orderList[index]) + "_") + index));
}