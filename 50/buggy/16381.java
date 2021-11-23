public void addAnswer(org.animotron.manipulator.QCAVector i) {
    if ((answers) == null)
        answers = javolution.util.FastList.newInstance();
    
    answers.add(i);
}