public int getInt() {
    int eingabe = 0;
    java.lang.String text = scan.nextLine();
    if (text.equals("exit")) {
        java.lang.System.exit(0);
    }else {
        try {
            eingabe = java.lang.Integer.parseInt(text);
        } catch (java.lang.Exception e) {
            return -1;
        }
    }
    return eingabe;
}