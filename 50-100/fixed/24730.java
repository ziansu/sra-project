public void addToGoroup(net.ukr.bior.Lesson2.HW.L1.Student student) throws net.ukr.bior.Lesson2.HW.L1.OutOfBoundGroupExeption {
    if (student == null)
        throw new java.lang.NullPointerException();
    
    int test = 0;
    for (int i = 0; i < (gr.length); i++) {
        if ((gr[i]) == null) {
            gr[i] = student;
            test = 1;
            break;
        }
    }
    if (test == 0)
        throw new net.ukr.bior.Lesson2.HW.L1.OutOfBoundGroupExeption();
    
}