public void runPattern1() throws java.io.IOException {
    pattern1.TakeInput ti = new pattern1.TakeInput();
    pattern1.Data data = new pattern1.Data();
    pattern1.Alphabetizer al = new pattern1.Alphabetizer();
    pattern1.CircularShift cs = new pattern1.CircularShift();
    java.util.ArrayList<java.lang.String> result = new java.util.ArrayList<java.lang.String>();
    while (true) {
        ti.takeInput(data);
        cs.circularShift(data);
        al.alphabetize(data);
        data.display();
    } 
}