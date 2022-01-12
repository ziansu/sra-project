@java.lang.Override
public int getSectionForPosition(int position) {
    int i = 0;
    int maxLength = usedSectionNumbers.length;
    while ((i < maxLength) && (position >= (sectionToPosition.get(usedSectionNumbers[i])))) {
        i++;
    } 
    return usedSectionNumbers[(i - 1)];
}