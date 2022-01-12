public static void main(java.lang.String[] args) {
    java.lang.String prints;
    java.lang.String selection;
    Driver game = new Driver();
    prints = "Would you like to do the tutorial? (Recommended for new players)\n";
    prints += "Selection (Yes or No): ";
    java.lang.System.out.print(prints);
    selection = readString();
    if (selection.equals("Yes")) {
        tutorial();
    }
}