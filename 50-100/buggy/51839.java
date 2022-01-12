public static int options(java.util.Scanner kb) {
    while (true) {
        textadventure.out("Your possible options are:\n1.)Search\n2.)Inventory\n3.)Leave\n");
        int x = textadventure.givemenumber(kb.nextLine());
        if ((x >= 1) && (x <= 3))
            return x;
        else
            textadventure.out("Invalid choice: please enter a number between 1 and 3");
        
    } 
}