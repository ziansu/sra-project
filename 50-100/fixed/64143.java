@java.lang.Override
public void display() {
    boolean done = false;
    do {
        java.lang.String value = this.getInput();
        if (value.toUpperCase().equals("Q"))
            return ;
        
        done = this.doAction(value);
    } while (!done );
}