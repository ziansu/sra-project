@java.lang.Override
public int getInt() {
    try {
        java.lang.String inputInt = getString();
        return java.lang.Integer.parseInt(inputInt);
    } catch (java.lang.NumberFormatException e) {
        show("must be an integer. Try again");
        getInt();
    }
    return 0;
}