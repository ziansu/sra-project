public static void main(java.lang.String[] args) {
    LinkedList myList = new LinkedList();
    if (myList.isEmpty())
        java.lang.System.out.println("It's empty.");
    else
        java.lang.System.out.println("Has nodes in it.");
    
    for (int i = 0; i < (args.length); i++) {
        myList.insertFirst(args[i]);
    }
    while (!(myList.isEmpty())) {
        java.lang.System.out.println(myList.removeFirst().data);
    } 
}