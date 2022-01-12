public static java.util.ArrayList<modles.Student> filterStudentsByInstrument(java.util.HashMap<java.lang.String, modles.Student> students, java.lang.String instrument) {
    java.util.ArrayList<modles.Student> matches = new java.util.ArrayList<>();
    for (java.lang.String key : students.keySet()) {
        java.lang.System.out.println(key);
        if (students.get(key).getInstrumentName().equals(instrument))
            matches.add(students.get(key));
        
    }
    return matches;
}