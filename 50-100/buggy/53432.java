private boolean isValidConnectString(java.lang.String input) {
    java.lang.String[] connectString = input.split(" ");
    return (((connectString.length) == 3) && (connectString[0].equals("connect"))) && (isValidPort(connectString[2]));
}