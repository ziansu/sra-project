public void run() {
    java.lang.String line;
    do {
        line = nextLine();
        for (core.Shifter shifter : Shifters)
            shifter.accept(line);
        
    } while (!(line.equals("")) );
}