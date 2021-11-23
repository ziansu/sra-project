public void charName(charGen.charGen.charStats charObject, java.util.Scanner input) {
    java.lang.System.out.println("What is your Character's Name?");
    charObject.name = input.nextLine();
    java.lang.System.out.println(charObject.name);
}