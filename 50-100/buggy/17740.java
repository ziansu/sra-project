protected java.util.ArrayList<java.lang.String> getChoice() {
    java.util.ArrayList<java.lang.String> arr = new java.util.ArrayList<java.lang.String>(4);
    int start = 4 * ((ExamNum) - 1);
    int end = (ExamNum) * 5;
    for (int i = start; i < end; i++)
        arr.add(cho.get(i));
    
    return arr;
}