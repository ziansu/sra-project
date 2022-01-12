public void setNum(int val) {
    num = val;
    if ((subQuestions) == null)
        return ;
    
    for (int i = 0; i < (subQuestions.size()); i++)
        subQuestions.get(i).setSubqNum(val, (i + 1));
    
}