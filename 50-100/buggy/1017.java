public int getInt() {
    int eingabe = 0;
    java.lang.String text = scan.nextLine();
    if (text.equals("exit")) {
        eingabe = -2;
    }else {
        try {
            eingabe = java.lang.Integer.parseInt(text);
        } catch (java.lang.Exception e) {
            eingabe = -1;
        }
    }
    return eingabe;
}