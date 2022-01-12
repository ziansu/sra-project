private void printEditedDetails() {
    java.lang.StringBuffer buf = new java.lang.StringBuffer();
    for (java.lang.Object contact : repeater.getBeanList()) {
        buf.append(contact).append('\n');
    }
    console.setText(buf.toString());
}