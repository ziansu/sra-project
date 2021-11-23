@java.lang.Override
public void display() {
    java.lang.System.out.println(displayMessage);
    boolean done = false;
    do {
        java.lang.String value = this.getInput();
        if (value.toUpperCase().equals("Q"))
            return ;
        
        done = this.doAction(value);
    } while (!done );
}