public long inputGroupID(java.lang.String prompt) {
    java.lang.System.out.print(prompt);
    java.lang.String group_id_str = Driver.scanner.nextLine();
    if (!(Driver.isInteger(group_id_str))) {
        java.lang.System.out.println("\nERROR: Invalid ID (must be an integer)\n");
        return -1;
    }
    long group_id = java.lang.Integer.parseInt(group_id_str);
    if (!(groupExists(group_id))) {
        java.lang.System.out.println((("\nERROR: Group with id " + group_id) + " does not exist.\n"));
        return -1;
    }
    return group_id;
}