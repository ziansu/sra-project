@java.lang.Override
public java.lang.Double getDoubleValue() {
    java.lang.Double scanned = null;
    do {
        if (scanner.hasNextDouble()) {
            scanned = scanner.nextDouble();
        }else {
            if (scanner.hasNext("q"))
                java.lang.System.out.println("Entered q - emergency exit");
            
            java.lang.System.exit(0);
            java.lang.System.out.println("You must enter value. Press \"q\" for exit");
            scanner.next();
        }
    } while (scanned == null );
    return scanned;
}