public int getMarks(int subjectId) {
    switch (subjectId) {
        case 1 :
            cMarks = subject[0];
            break;
        case 2 :
            cMarks = subject[1];
            break;
        case 3 :
            cMarks = subject[2];
            break;
        case 4 :
            cMarks = subject[3];
            break;
        case 5 :
            cMarks = subject[4];
            break;
    }
    return cMarks;
}