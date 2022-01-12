public void update(int s, int minute) {
    java.lang.String sec = java.lang.Integer.toString(s);
    java.lang.String min = java.lang.Integer.toString(minute);
    if (s <= 10) {
        sec = "0" + sec;
    }
    java.lang.System.out.println(((min + ":") + sec));
    time.setText(((min + ":") + sec));
}