private boolean isValidConnectString(java.lang.String input) {
    java.lang.String[] connectString = input.split(" ");
    java.lang.System.out.println(connectString.length);
    java.lang.System.out.println(connectString[0]);
    java.lang.System.out.println(connectString[2]);
    return (((connectString.length) == 3) && (connectString[0].equals("connect"))) && (isValidPort(connectString[2]));
}