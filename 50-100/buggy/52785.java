public boolean remove() {
    try {
        java.lang.System.out.println("Remove account");
        java.lang.String name = ((java.lang.String) (inFromClient.readObject()));
        java.lang.System.out.println((("Account of " + name) + " deleted."));
        return true;
    } catch (java.io.IOException e) {
        java.lang.System.out.println("IOException");
        return false;
    } catch (java.lang.ClassNotFoundException e) {
        java.lang.System.out.println("Classnotfoundexception");
        return false;
    }
}