public java.lang.String[] getArguments() {
    if (((this.arguments) == null) || (this.arguments.isEmpty()))
        return new java.lang.String[0];
    
    return this.arguments.split("\\s+");
}