private void printEditedDetails() {
    java.lang.StringBuilder buf = new java.lang.StringBuilder();
    for (java.lang.Object contact : repeater.getBeanList()) {
        buf.append(contact).append('\n');
    }
    console.setText(buf.toString());
}