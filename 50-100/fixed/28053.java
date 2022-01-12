@java.lang.Override
public void run() {
    keepRunning = true;
    int counter = 0;
    while ((keepRunning) && (counter < (files.length))) {
        try {
            runSearch(files[counter]);
            counter++;
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (java.lang.InterruptedException e) {
            java.lang.System.out.println(("The thread was interrupted" + (java.lang.System.lineSeparator())));
        }
    } 
}