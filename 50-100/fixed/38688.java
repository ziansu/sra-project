public void chooseCulprit() {
    java.lang.System.out.println("MOCK ENDING FOR DEMO VERS PURPOSES.");
    java.lang.System.out.println(("\nThe time has come. Who is the murderer?" + (("\n1. Mrs. Irma Caro" + "\n2. Mr. Peter Arnolds") + "\n3. Ms. Trixie Stevenson")));
    java.lang.System.out.println("\nType in the number of your choice or 0 to check inventory.");
    int a = cs1.Keyboard.readInt();
    if (a == 0) {
        this.InventoryScroll();
        this.chooseCulprit();
    }else
        if (a == 2) {
            java.lang.System.out.println("Congratulations Sherlock! You've solved the crime!");
        }else {
            java.lang.System.out.println(("You point your finger in confidence, but unfortunately, you were mistaken. With your incorrect accusation, an innocent has been made to suffer unjust consequences." + "\nThe End"));
        }
    
}