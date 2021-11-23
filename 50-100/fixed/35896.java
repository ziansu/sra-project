public void dolphin() {
    char selection;
    do {
        java.lang.System.out.println(("Hey! Help! I need to know how fast I can get to my family. they are 5 miles east" + "\n I can swim about 2 kilometers per hour"));
        java.lang.System.out.println(("?\n" + (("\nh = Help" + "\ns = Step away and let the dolphin drown in its own stupidity.") + "\nb = Back")));
        selection = getinput.getChar();
        doAction(selection);
    } while (selection != 'b' );
}