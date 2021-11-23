public static void generateDataForCourse(java.lang.String courseName) {
    long numOfInstr = java.lang.Math.round(((teammates.client.scripts.DataGenerator.random.nextInt((((teammates.client.scripts.DataGenerator.MAX_NUM_OF_INSTRUCTOR_PER_COURSES) - (teammates.client.scripts.DataGenerator.MIN_NUM_OF_INSTRUCTOR_PER_COURSES)) + 1))) + (teammates.client.scripts.DataGenerator.MIN_NUM_OF_INSTRUCTOR_PER_COURSES)));
    for (int j = 0; j < numOfInstr; j++) {
        java.lang.String instrName = (("Instr" + j) + "_of_") + courseName;
        teammates.client.scripts.DataGenerator.instructors.put(instrName, courseName);
    }
    teammates.client.scripts.DataGenerator.generateStudentsDataForCourse(courseName);
}