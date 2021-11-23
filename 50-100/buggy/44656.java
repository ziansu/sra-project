@java.lang.SuppressWarnings(value = "unchecked")
public static java.util.ArrayList<cryptocoinutil.Transaction> deserializeList(byte[] transactions, int transactionCount) throws java.util.InputMismatchException {
    try {
        java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(transactions);
        java.io.ObjectInputStream ois = new java.io.ObjectInputStream(bais);
        return ((java.util.ArrayList<cryptocoinutil.Transaction>) (ois.readObject()));
    } catch (java.lang.ClassNotFoundException | java.io.IOException e) {
        throw new java.util.InputMismatchException("One or more input parameters are invalid!");
    }
}