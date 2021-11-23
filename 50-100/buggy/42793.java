@java.lang.Override
public void run() {
    int counter = 0;
    while (counter < 10) {
        bucket.putToken(new Token(countrt, java.lang.Thread.currentThread().getName()));
        java.lang.System.out.println(((("PUT: " + (java.lang.Thread.currentThread().getName())) + " ") + counter));
        counter++;
    } 
}