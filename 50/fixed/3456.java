public java.lang.StringBuilder getMessage() {
    message = new java.lang.StringBuilder();
    message.append("Your user name is ");
    message.append(username);
    message.append(" and your password is ");
    message.append(password);
    return message;
}