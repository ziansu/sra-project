private void orderedInsert(gradesystem.Grades insertedGrade) {
    int index = 0;
    gradesystem.Grades element;
    while (index < (aList.size())) {
        element = aList.get(index);
        if ((insertedGrade.getTotalGrade()) > (element.getTotalGrade())) {
            aList.add(index, insertedGrade);
            break;
        }
        index++;
    } 
    if (index == (aList.size()))
        aList.add(index, insertedGrade);
    
}