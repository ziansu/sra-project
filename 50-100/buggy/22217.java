public void delFromGroup(net.ukr.bior.Lesson2.HW.L1.Student student) {
    for (int i = 0; i < (gr.length); i++) {
        if (gr[i].equals(student)) {
            gr[i] = null;
            break;
        }
    }
}