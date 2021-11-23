public void setMarks(int marks, int subjectId) {
    cMarks = marks = ((marks > 0) && (marks < 100)) ? marks : 0;
    switch (subjectId) {
        case 1 :
            subject[0] = marks;
            break;
        case 2 :
            subject[1] = marks;
            break;
        case 3 :
            subject[2] = marks;
            break;
        case 4 :
            subject[3] = marks;
            break;
        case 5 :
            subject[4] = marks;
            break;
    }
}