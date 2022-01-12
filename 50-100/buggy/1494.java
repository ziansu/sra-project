public int[] readInitialLocation(java.io.InputStream stream) {
    java.util.Scanner in = new java.util.Scanner(stream);
    in.useDelimiter("\n");
    java.lang.System.out.println("Location:");
    if (in.hasNext()) {
        java.lang.String loc = in.next();
        return convertLocation(loc);
    }
    return null;
}