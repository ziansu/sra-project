public java.lang.String getIpFromForwardedFor(java.lang.String input) {
    if (input == null)
        return null;
    
    if (!(input.contains(",")))
        return input;
    
    java.lang.String[] splits = input.split(",");
    return splits[((splits.length) - 1)];
}