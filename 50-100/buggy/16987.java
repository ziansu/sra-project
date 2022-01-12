@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    java.lang.String newLine = java.lang.System.lineSeparator();
    sb.append(newLine);
    sb.append("Checkout Record: ");
    for (business.CheckoutRecordEntry entry : checkoutRecordEntries) {
        sb.append(entry.toString());
        sb.append(newLine);
    }
    return sb.toString();
}