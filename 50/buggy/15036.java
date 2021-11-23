protected java.lang.String getProblem() {
    java.lang.String str = null;
    int temp = 4 * ((ExamNum) - 1);
    str = pro.get(temp);
    return str;
}