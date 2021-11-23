public synchronized void handle(int ID, java.lang.Object input) {
    java.lang.System.out.println(("New Message Recieved: " + input));
    if (input == null)
        return ;
    
    this.controller.handle(ID, input);
}