public void setComputerColor() {
    java.util.Random ran = new java.util.Random();
    int temp;
    do {
        temp = ran.nextInt(3125);
        playerColor = jp.GamePlayer.colors[temp];
    } while ((jp.GamePlayer.next[temp]) != 0 );
    jp.GamePlayer.next[temp] = 1;
    java.lang.System.out.println(playerColor);
}