private void orderedInsert(gradesystem.Grades insertedGrade) {
    int index = 0;
    gradesystem.Grades element;
    while ((element = aList.get(index)) != null) {
        if ((insertedGrade.getTotalGrade()) > (element.getTotalGrade())) {
            aList.add(index, insertedGrade);
            break;
        }
        index++;
    } 
    if (index == (aList.size()))
        aList.add(index, insertedGrade);
    
}