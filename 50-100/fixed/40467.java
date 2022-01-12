private java.lang.String hidePassword(java.util.List<java.lang.String> command) {
    java.lang.String credential = command.get(3);
    return command.toString().replace(credential, ((credential.substring(0, ((credential.indexOf(":")) + 1))) + "***"));
}