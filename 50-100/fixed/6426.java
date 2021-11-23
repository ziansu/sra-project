public void print() {
    java.lang.String studentFee;
    if ((feePaid) == true) {
        studentFee = "yes";
    }else {
        studentFee = "no";
    }
    java.lang.System.out.println((((((((((("Student ID: " + (studentId)) + "\t") + "Name: ") + (studentName)) + "\t") + "Course: ") + (studentCourse)) + "\t") + "Fee Paid: ") + studentFee));
}