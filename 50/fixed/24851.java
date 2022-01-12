private java.lang.String validateExercises(java.lang.String id) {
    while (!(database.WorkOut.isNumeric(id))) {
        java.lang.System.out.println("Has to be a number");
        java.lang.System.out.println("Choose an exercise by its ID: ");
        id = scanner.nextLine().trim();
    } 
    return id;
}