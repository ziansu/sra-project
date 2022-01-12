static java_cup.non_terminal create_new(java.lang.String prefix, java.lang.String type) throws java_cup.internal_error {
    if (prefix == null)
        prefix = "NT$";
    
    return new java_cup.non_terminal((prefix + ((java_cup.non_terminal.next_nt)++)), type);
}